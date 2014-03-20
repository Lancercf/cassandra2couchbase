package uk.ac.bham.cs.tuple;

public abstract class Tuple {
	/**
	 * 
	 */
	protected final Integer numberOfElements;
	
	/**
	 * 
	 * @param numberOfElements
	 */
	public Tuple(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer numberOfElements() {
		return this.numberOfElements;
	}
	
	@Override
	public abstract String toString();
}
