package shape;

/**
 * A Three Dimensional Shape of a Sphere.
 * @author Julian Itwaru.
 * @version 1.0.
 */
public class Sphere extends ThreeDimensionalShape
{
	
	/**
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Sphere(int x, int y, int radius)
	{
		super(x,y,radius, radius, radius);
	}
	
	/**
	 * Returns a integer value for Dimension 1.
	 * @return getRadius() Returns an Integer value for Dimension 1. 
	 */
	public int getRadius()
	{
		return super.getDimension1();
	}
	
	/**
	 * Changes the integer value for dimension 1 and dimension 2 and dimension 3. 
	 * @param radius Changes the value for both dimension1 and dimension2 and dimension3. 
	 */
	public void setRadius(int radius)
	{
		super.setDimension1(radius);
		super.setDimension2(radius);
		super.setDimension3(radius);
	}
	/**
	 * A String Literal of the Shape Name.  
	 * @return getName() A String Literal of the Shape Name.
	 */
	public String getName()
	{
		return "This is a sphere and its area and volume are: ";
	}

	/**
	 * Calculated the Area and returns an abstract value.   
	 * @return getArea() A integer value of the calculated area. 
	 */
	public int getArea()
	{
		int a = (int) (4*(Math.PI)*((Math.pow(getDimension1(), 2))));
		return a;
	}

	/**
	 *  A calculated volume. 
	 * @return getVolume() A calculated volume of the shape.
	 */
	public int getVolume()
	{
		int v = (int) ((4)*(Math.PI)*(Math.pow(getDimension1(), 3)/3));
		return v;
	}

	/**
	 * Returns a String literal of the Shape details.
	 * @return toString() A String literal of the shape details.
	 */
	public String toString()
	{
		return super.toString() +" "+ getArea() + " " + getVolume(); 
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
		if(!(obj instanceof Sphere))
		{
			return false;
		}
		Sphere other = (Sphere)obj;
		return super.equals(other);
	}



























}
