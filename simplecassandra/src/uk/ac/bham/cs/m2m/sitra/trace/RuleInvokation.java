package uk.ac.bham.cs.m2m.sitra.trace;

import uk.ac.bham.sitra.Rule;

/**
 * <p>
 * An implementation of the {@link TraceableElement} interface.
 * </p>
 * <p>
 * This holds the three-tuple often used to identify a model-to-model
 * transformation.
 * <ul>
 * <li>The <em>source</em> object;</li>
 * <li>the <em>target</em> object; and</li>
 * <li>the <em>transformation rule</em> used to transform them.</li>
 * </ul>
 * </p>
 * 
 * @author John T. Saxon
 */
public class RuleInvokation<S, T> implements TraceableElement<S, T> {
	/**
	 * <p>
	 * The source object.
	 * </p>
	 */
	protected S source;

	/**
	 * <p>
	 * The target object.
	 * </p>
	 */
	protected T target;

	/**
	 * <p>
	 * The type of rule used to transform S -&gt; T
	 * </p>
	 */
	protected final Class<? extends Rule<S, T>> rule;

	/**
	 * @param rule
	 *            The rule used to transform a source to a target.
	 */
	public RuleInvokation(Class<? extends Rule<S, T>> rule) {
		this.rule = rule;
	}

	/**
	 * @param source
	 *            The source object.
	 * @param target
	 *            The target object.
	 * @param rule
	 *            The rule used to transform them.
	 */
	public RuleInvokation(S source, T target, Class<? extends Rule<S, T>> rule) {
		this.setSource(source);
		this.setTarget(target);
		this.rule = (Class<? extends Rule<S, T>>) rule;
	}

	/**
	 * 
	 * @return The source object.
	 */
	public S getSource() {
		return this.source;
	}

	/**
	 * 
	 * @param source
	 */
	public void setSource(S source) {
		this.source = source;
	}

	/**
	 * 
	 * @return The resultant object.
	 */
	public T getTarget() {
		return this.target;
	}

	/**
	 * 
	 * @param target
	 */
	public void setTarget(T target) {
		this.target = target;
	}

	/**
	 * 
	 * @return The class identifying the rule.
	 */
	public Class<? extends Rule<S, T>> getTransformationRule() {
		return this.rule;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("===\n");
		stringBuilder.append("S: " + this.getSource() + "\n");
		stringBuilder.append("T: " + this.getTarget() + "\n");
		stringBuilder.append("R: "
				+ this.getTransformationRule().getSimpleName() + "\n");
		stringBuilder.append("===");
		return stringBuilder.toString();
	}
}
