/**
 * @author Julian
 * @version 1.0 
 */
package doge;

public  class FailDoge extends Doge
{
	//Creates a weight for the Doge
	private int breedWeight = 6;
	
	//Default constructor.
	public FailDoge()
	{
		this(null);
	}
	
	//Live constructor that gives a doge name.
	public FailDoge(String name)
	{
		super(name);
		super.setDogeType("Yorkshire");
		
	}
	
	/**
	 * Abstract for the BreedWeight
	 * 
	 * @param BreedWeight
	 */
	public int BreedWeight()
	{
		return this.breedWeight;
	}	
	
	/**
	 * A String representation of what a doge says.
	 * 
	 * @return speak A String literal of what a doge says.
	 */
	public String speak()
	{
		return  "Fail Woof Woof";
	}
	
	/**
	 * A String representation of a doge.
	 * 
	 * @return toString a String Literal of a doge
	 */
	public String toString()
	{
		return super.toString()+" "+ this.speak() + " " + BreedWeight() + "\n";
	}
	
	/**
	 * Compares an object to see if it "is equal" to another object. If object
	 * is not "equal to" other object return false. 
	 * 
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof FailDoge))
			{
				return false;
			}
		FailDoge other = (FailDoge)obj;
		return super.equals(other);
	}

}
