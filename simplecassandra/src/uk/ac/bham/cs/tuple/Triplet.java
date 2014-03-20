package uk.ac.bham.cs.tuple;

public class Triplet<A, B, C> extends Tuple {
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
	 */
	protected final C valueC;
	
	/**
	 * 
	 * @param valueA
	 * @param valueB
	 * @param valueC
	 */
	public Triplet(A valueA, B valueB, C valueC) {
		super(3);
		this.valueA = valueA;
		this.valueB = valueB;
		this.valueC = valueC;
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
	 * @return
	 */
	public C getC() {
		return this.valueC;
	}
	
	/**
	 * 
	 * @param valueA
	 * @param valueB
	 * @param valueC
	 * @return
	 */
	public static <A, B, C> Triplet<A, B, C> with(A valueA, B valueB, C valueC) {
		return new Triplet<A, B, C>(valueA, valueB, valueC);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " { a: " + this.getA() + " b: " + this.getB() + " c: " + this.getC() + " }";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valueA == null) ? 0 : valueA.hashCode());
		result = prime * result + ((valueB == null) ? 0 : valueB.hashCode());
		result = prime * result + ((valueC == null) ? 0 : valueC.hashCode());
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
		Triplet<?, ?, ?> other = (Triplet<?, ?, ?>) obj;
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
		if (valueC == null) {
			if (other.valueC != null)
				return false;
		} else if (!valueC.equals(other.valueC))
			return false;
		return true;
	}
}
