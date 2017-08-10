package shape;

/**
 * Represents the dimensions of a two dimensional shape.
 *@author Julian Itwaru
 *@version 1.0
 */
public abstract  class TwoDimensionalShape extends Shape 
{
	//The first dimension for two dimensional shape
	private int dimension1;
	//the second dimension for two dimensional shape
	private int dimension2;
	
	/**
	 * Constructor for the Two Dimensional Shape to set up the values and parameters. 
	 * @param x
	 * @param y
	 * @param dimension1
	 * @param dimension2
	 */
	
	public TwoDimensionalShape(int x,int y,int dimension1,int dimension2)
	{
		super(x,y);
		
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	/**
	 * Returns dimension1
	 * @return getLenght Returns the dimension 
	 */
	public int getDimension1()
	{
		return this.dimension1;
	}
	/**
	 * Changes the Value of Dimension1.
	 * @param dimension1 Changes the integer of the first dimension.
	 */
	public void setDimension1(int dimension1)
	{
		this.dimension1 = dimension1;
	}
	/**
	 * Returns the Width.
	 * @return getWidth returns the value of the width.
	 */
	public int getDimension2()
	{
		return dimension2;
	}
	/**
	 * Changes the value of dimension2.
	 * @param dimension2 Changes the integer of the second dimension. 
	 */
	public void setDimension2(int dimension2)
	{
		this.dimension2 = dimension2;
	}
	/**
	 *Calculated the Area and returns an abstract value.   
	 * @return getArea() A integer value of the calculated area. 
	 */
	public abstract int getArea();
	/**
	 * A String Literal of the Shape Name.  
	 * @return getName() A String Literal of the Shape Name.
	 */
	public String getName()
	{
		return "A Two Dimensional Shape that is a: ";
	}
	
	
	/**
	 * Returns a String literal of the Shape details.
	 * @return toString() A String literal of the shape details.  
	 */
	public String toString()
	{
		return super.toString() + " ";
	}
	/**
	 * Indicates if some other object is "equal to" an another object. If other object is "equal to" object than return a true.
	 * If other object is not "equal to" other object return a false.
	 * 
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if some other object is "equal to" this shape
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof TwoDimensionalShape))
		{
			return false;
		}
			TwoDimensionalShape other = (TwoDimensionalShape)obj;
			return super.equals(other) && this.dimension1 == other.dimension1 && this.dimension2 == other.dimension2;
		}	
			
	}