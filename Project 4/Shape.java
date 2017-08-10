package shape;
/**
 * Shape will set up the x and y points for the object. Shape is also the Super class that will setup the two and three dimensional shape.
 * 
 * @author Julian
 * @version 1.0
 */
public abstract class Shape 
{
	//The x point of this shape.
	private int x;
	
	//The y point of this shape. 
	private int y;
	
	
	/**
	 * A null constructor with zero values for both x and y. 
	 */
	public Shape()
	{
		this(0,0);
	}
	
	
	/**
	 * Constructs a new point with x as x coordinate and y as y coordinate.
	 * 
	 * @param x a single point on a Cartesian plane. 
	 * @param y a single point on a Cartesian  plane. 
	 */
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Returns an integer for x.
	 * @return x an integer value for the x point.
	 */
	public int getX()
	{
		return this.x;
	}
	
	/**
	 * Changes the integer value.
	 * @param x Changes the X value for the point.
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	
	/**
	 * Returns an integer for y.
	 * @return y an integer value for the y point.
	 */
	public int getY()
	{
		return this.y;
	}
	
	/**
	 * Changes the integer value.
	 * @param y Changes the Y value for the y point.
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	/**
	 * Abstract method.
	 * 
	 * @return getName A method that is abstract.
	 */
	public abstract String getName();
	/**
	 * Abstract String representation.
	 * 
	 * @return toString A String literal that returns the x and y value.
	 */
	public String toString()
	{
		return "Vertex starts at: (" + this.x + ","+ this.y + "),";
	}
	
	/**
	 * Indicates if some other object is "equal to" this point. Two points are "equal to" each 
	 * other if their x point are the same and their y point are the same.
	 * @param equals 
	 * @return A boolean value specifying if some other object is "equal to" this point.
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Shape))
		{
			return false;
		}
		Shape other = (Shape)obj;
		return this.x == other.x && this.y == other.y;
	}
	
}
