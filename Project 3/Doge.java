/**
 * @author Julian
 * @version 1.0
 */
package doge;

public abstract class Doge implements Comparable<Doge>  
{
	//Creates a string for Name
	private String name;
	
	// Creates an int for ID
	private int id;
	
	//Generates a nextID integer
	private static int nextID = 100;
	
	//Creates a type for the doge. 
	private String dogeType;

	
	
	/**
	 * Default constructor with null value
	 */
	public Doge()
	{
		this(null);
	}
	
	
	/**
	 * Live constructor.
	 * 
	 * Constructor that will call for real name and id of a doge.
	 * @param name 
	 * @param id
	 */
	public Doge(String name)
	{
		this.name = name;
		this.id = nextID;
		nextID++;
	}
	
	/**
	 * Returns a name.
	 * 
	 * @return name A string literal of a name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Changes the name of the doge.
	 * 
	 * @param name An actual string representation of a Name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns an integer.
	 * 
	 * @return id Returns an integer for the Doge's id.
	 */
	public int getID()
	{
		return this.id;
	}
	
	/**
	 * Returns an integer.
	 * 
	 * @return nextID Returns an integer for the next Doge's Id. 
	 */
	public int getnextID()
	{
		return this.id = nextID;
	}
	
	public String getDogeType()
	{
		return dogeType;
	}
	
	public void setDogeType(String dogeType)
	{
		this.dogeType = dogeType;
	}
	

	
	/**
	 * Returns a string.
	 * 
	 * @return Speak A string representation of what a doge says.
	 */
	public String speak()
	{
		return "";
	}
	
	
	public abstract int BreedWeight();
	
	/**
	 * A String representation for the Doge.
	 *@return A string literal that will contain a Doge's name and Id.
	 */
	public String toString()
	{
		return this.name + " " + this.id ;
	}
	/**
	 * Indicates whether an object is "equal to" another object.
	 * If the Object is not "equal to" other object return a false.
	 * 
	 * @param obj A reference to some other object.
	 * @return A boolean value specifying if this Doge is "equal to" some other object.
	 */
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Doge))
		{
			return false;
		}
	Doge other = (Doge)obj;
	return this.id == (other).id;
	
		
	}
	
	public int compareTo(Doge e)
	{
		if ((new Long(this.id)).compareTo(new Long(e.id)) > 0)
		{
			return 1;
		}else if((new Long(this.id)).compareTo(new Long(e.id)) < 0)
		{
			return -1;
		}else
		{
			return 0;
		}
	}
	
}

