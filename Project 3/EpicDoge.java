/**
 * @author Julian
 * @version 1.0
 * 
 */
package doge;

public  class EpicDoge extends Doge
{
	//Creates a String for Doge color
	private String color;
	
	//Creates an int for the breed weight
	private int breedWeight = 75;
	
	
	//A default constructor to pass a null
	public EpicDoge()
	{
		this(null, null);
	}
	
	/**
	 * Creates a real Epic Doge.
	 * 
	 * @param color
	 * @param BreedWeight
	 */
	public EpicDoge(String name, String color)
	{
		super(name);
		super.setDogeType("Labrador");
		
		this.color = color;
		
	}
	
	/**
	 * Returns a string representation of the Epic Doge color.
	 * 
	 * @return color A String Literal of Epic Doge Color.
	 */
	public String getColor()
	{
		return this.color;
	}
	
	
	/***
	 * Changes the color.
	 * 
	 * @param color Changes the String literal to an actual color for the Doge.
	 */
	public void setColor(String color)
	{
		this.color = color;
	}
	
	/**
	 * Returns a string representation of Speak.
	 * 
	 * @return speak A String Literal of speak.
	 */
	
	public int BreedWeight()
	{
		return this.breedWeight;
	}
	
	/*public void setBreedWeight(int BreedWeight)
	{
		this.BreedWeight = 75;
	}*/
	
	
	
	/**
	 * Creates a string that will act as a speak for the epic doge.
	 * 
	 * @param speak
	 */
	public String speak()
	{
		return  "Epic Woof Woof";
	}
	/**
	 * Returns an integer value.
	 * 
	 * @return BreedWeight A Integer value of the Epic Doges Weight. 
	 */
	
	public String toString()
	{
		return super.toString()+ " "+ this.color+ " "+ speak()+ " " + BreedWeight() + "\n";
	}
	/**
	 * 
	 * Indicated is an object "is equal" to another object.
	 * If the object is not "equal to" other object return a false.
	 * If other object is "equal to" 
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof EpicDoge))
			{
				return false;
			}
		EpicDoge other = (EpicDoge)obj;
		return super.equals(other);
	}

	
	
	
	
	
	
	
	
}

