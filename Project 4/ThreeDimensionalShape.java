package shape;

/**
 * Represents the dimensions of a three dimensional shape.
 * @author Julian Itwaru
 *
 */
public abstract class ThreeDimensionalShape extends Shape
{
	//The first dimension of a Shape
	private int dimension1;
	//The second dimension of a Shape
	private int dimension2;
	//The third dimension of a shape
	private int dimension3;
	
	/**
	 * Constructor for the Two Dimensional Shape to set up the values and parameters.
	 * 
	 * @param x
	 * @param y
	 * @param dimension1
	 * @param dimension2
	 * @param dimension3
	 */
	public ThreeDimensionalShape(int x, int y, int dimension1, int dimension2, int dimension3)
	{
		super(x,y);
		
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.dimension3 = dimension3;
	}
	/**
	 * Returns An integer value for dimension1.
	 * @return getLength An integer value for dimension1.
	 */
	public int getDimension1()
	{
		return this.dimension1;
	}
	/**
	 * Changes the integer value for Dimension1.
	 * @param dimension1 Changes the length of dimension1. 
	 */
	public void setDimension1(int dimension1)
	{
		this.dimension1 = dimension1;
	}
	/**
	 *  * Returns An integer value for dimension1.
	 * @return getLength An integer value for dimension1.
	 */
	public int getDimension2()
	{
		return this.dimension2;
	}
	
	/**
	 * Changes the integer value for Dimension1.
	 * @param dimension2 Changes the length of dimension2. 
	 */
	public void setDimension2(int dimension2)
	{
		this.dimension2 = dimension2;
	}
	
	/**
	 * Returns An integer value for dimension3.
	 * @return getLength An integer value for dimension3.
	 */
	public int getDimension3()
	{
		return this.dimension3;
	}
	
	/**
	 * Changes the integer value for Dimension3.
	 * @param dimension3 Changes the length of dimension3.
	 */
	public void setDimension3(int dimension3)
	{
		this.dimension3 = dimension3;
	}
	
	/**
	 * A calculated area.
	 * @return getArea() A calculated area of the shape. 
	 */
	public abstract int getArea();
	
	/**
	 *  A calculated volume. 
	 * @return getVolume() A calculated volume of the shape.
	 */
	public abstract int getVolume();
	
	/**
	 *  A String.
	 * @return getName() A string Literal of the shapes name.
	 */
	public String getName()
	{
		return "A Three Dimensional Shape that is: ";
	}
	
	/**
	 *  Returns a String literal of the Shape details.
	 * @return toString() A String literal of the shape details.
	 */
	public String toString()
	{
		return super.toString()+ " " + getName(); 
 	}
	
	/* Indicates if some other object is "equal to" an another object. If other object is "equal to" object than return a true.
	* If other object is not "equal to" other object return a false.
	* 
	* @param obj A reference to some other object
	* @return A boolean value specifying if some other object is "equal to" this shape
	*/				 
	public boolean equals(Object obj)
	{
		if(!(obj instanceof ThreeDimensionalShape))
		{
			return false;
		}
			ThreeDimensionalShape other = (ThreeDimensionalShape)obj;
			return super.equals(other) && this.dimension1 == other.dimension1 && this.dimension2 == other.dimension2 && this.dimension3 == other.dimension3 ;
		}	
	
}
