package uk.ac.bham.cs.m2m.sitra;

import java.util.ArrayDeque;
import java.util.Deque;

import uk.ac.bham.cs.m2m.sitra.trace.RuleInvokation;
import uk.ac.bham.cs.m2m.sitra.trace.TraceableElement;
import uk.ac.bham.cs.m2m.sitra.trace.TraceableTransformer;
import uk.ac.bham.cs.tuple.Pair;
import uk.ac.bham.sitra.Rule;

/**
 * <p>
 * This instance of the {@link SimpleTransformer} maintains a list of all
 * transformations keeping the links of source, target and rule.
 * </p>
 * 
 * @author John T. Saxon
 * 
 * @see SimpleTransformer
 * @see uk.ac.bham.cs.m2m.sitra.trace.TraceableTransformer
 */
public class SimpleTraceableTransformer extends SimpleTransformer implements
		TraceableTransformer {
	/**
	 * <p>
	 * The is the trace persistable of a transformation.
	 * </p>
	 */
	private Deque<TraceableElement<?, ?>> transformationTrace = new ArrayDeque<TraceableElement<?, ?>>();

	@SuppressWarnings("unchecked")
	@Override
	public <S, T> T transform(
			final Class<? extends uk.ac.bham.sitra.Rule<S, T>> ruleClass,
			final S source) {
		// get the rule from the rule instance list
		Rule<S, T> rule = (Rule<S, T>) this.ruleInstances.get(ruleClass);
		if(rule == null) { // do we have a rule instance?
			return null;
		}

		// create a unique identifier for `source`
		// the way xtend2 does (not too sure why the array, but oh well)
		final Pair<?, ?> _cacheKey = Pair.with(source, ruleClass);
		T target = null;
		synchronized (this._createCache) {
			// does the unique key exist?
			if (this._createCache.containsKey(_cacheKey)) {
				// get it and return the value attached
				// TODO add cache hit to trace
				return (T) this._createCache.get(_cacheKey);
			}

			// does the rule match the source?
			if (rule.check(source)) {
				// create the instance of it
				target = rule.build(source, this);

				// create a entry for traceability
				RuleInvokation<?, ?> traceEntry = new RuleInvokation<S, T>(
						source, target, ruleClass);
				// ... add the trace entry to the root if empty
				this.getTransformationTrace().add(traceEntry);
				
				// did we get one?
				if (target != null) {
					this._createCache.put(_cacheKey, target);
				}

				// bind the values (using legacy method)
				rule.setProperties(target, source, this);
			}
		}

		// there is no transform
		return target;
	}

	@Override
	public Deque<TraceableElement<?, ?>> getTransformationTrace() {
		return this.transformationTrace;
	}
}
