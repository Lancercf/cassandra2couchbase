package uk.ac.bham.cs.tuple;

public class Pair<A, B> extends Tuple {
	/**
	 * 
	 */
	protected final A valueA;
	
	/**
	 * 
	 */
	protected final B valueB;
	
	/**
	 * 
	 * @param valueA
	 * @param valueB
	 */
	public Pair(A valueA, B valueB) {
		super(2);
		this.valueA = valueA;
		this.valueB = valueB;
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
	 * @return
	 */
	public B getB() {
		return this.valueB;
	}
	
	/**
	 * 
	 * @param valueA
	 * @param valueB
	 * @return
	 */
	public static <A, B> Pair<A, B> with(A valueA, B valueB) {
		return new Pair<A, B>(valueA, valueB);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " { a: " + this.getA() + " b: " + this.getB() + " }";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valueA == null) ? 0 : valueA.hashCode());
		result = prime * result + ((valueB == null) ? 0 : valueB.hashCode());
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
		Pair<?, ?> other = (Pair<?,?>) obj;
		if (valueA == null) {
			if (other.valueA != null)
				return false;
		} else if (!valueA.equals(other.valueA))
			return false;
		if (valueB == null) {
			if (other.valueB != null)
				return false;
		} else if (!valueB.equals(other.valueB))
			return false;
		return true;
	}
}
