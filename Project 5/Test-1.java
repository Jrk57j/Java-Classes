package geoShape;
import geoShape.Triangle;
/**
 * This just checks to see if the equals works. 
 * @author Julian Itwaru
 * @version 1.0
 */

public class Test 
{
	/**
	 * A simple test to see if the equals works by comparing two different triangles and one of the same. 
	 * @param args
	 * @throws IllegalTriangleException
	 */
	public static void main(String[] args) throws IllegalTriangleException
	{
		Triangle t3 = new Triangle("red", false, 5,6,9);
		Triangle t4 = new Triangle("pink", true, 5,4,2);
		
		System.out.println(t3.equals(t4));
		System.out.println(t3.equals(t3));
		
	}
	
	
	
	
	
	
	
}
