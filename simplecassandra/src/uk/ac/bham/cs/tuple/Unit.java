package uk.ac.bham.cs.tuple;

public class Unit<A> extends Tuple {
	/**
	 * 
	 */
	protected final A valueA;
	
	/**
	 * 
	 * @param valueA
	 */
	public Unit(A valueA) {
		super(1);
		this.valueA = valueA;
	}
	
	/**
	 * 
	 * @return
	 */
	public A getA() {
		return this.valueA;
	}
	
	/**
	 * 
	 * @param valueA
	 * @return
	 */
	public static <A> Unit<A> with(A valueA) {
		return new Unit<A>(valueA);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " { a: " + this.getA() + " }";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valueA == null) ? 0 : valueA.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit<?> other = (Unit<?>) obj;
		if (valueA == null) {
			if (other.valueA != null)
				return false;
		} else if (!valueA.equals(other.valueA))
			return false;
		return true;
	}
}
