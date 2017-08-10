package shape;

/**
 * Represents a square object of the Two Dimensional Shape.
 * @author Julian Itwaru
 * @version 1.0
 *
 */
public class Square extends TwoDimensionalShape 
{
	
	/**
	 * @param x
	 * @param y
	 * @param side
	 */
	public Square(int x, int y, int side)
	{
		super(x,y, side, side);
	}
	
	/**
	 * Returns a integer value for Dimension 1.
	 * @return getSide() Returns an Integer value for Dimension 1. 
	 */
	public int getSide()
	{
		return super.getDimension1();
	}
	/**
	 * Changes the integer value for dimension 1 and dimension 2. 
	 * @param side Changes the value for both dimension1 and dimension2. 
	 */
	public void setSide(int side)
	{
		super.setDimension1(side);
		super.setDimension2(side);
	}
	/**
	 * A String Literal of the Shape Name.  
	 * @return getName() A String Literal of the Shape Name.
	 */
	public String getName()
	{
		return "This is a square and its area is ";
	}
	
	/**
	 * Calculated the Area and returns an abstract value.   
	 * @return getArea() A integer value of the calculated area. 
	 */
	public int getArea()
	{
		int a = (getDimension1() * getDimension2());
		return a;
	}
	
	/**
	 * Returns a String literal of the Shape details.
	 * @return toString() A String literal of the shape details.
	 */
	public String toString()
	{
		return super.toString()+" " + getName() + "" + getArea();
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
		if(!(obj instanceof Square))
		{
			return false;
		}
		Square other = (Square)obj;
		return super.equals(other);
	}
	
	
	
}
