package shape;
/**
 * A test file that will compare, set, and get variable and see if object equal other objects. 
 * @author Julian.
 * @version 1.0.
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
		Shape s1 = new Square(0,0,0);
		s1.setX(0);
		s1.setY(0);
		//test the square
		((TwoDimensionalShape)s1).setDimension1(2);
		((TwoDimensionalShape)s1).setDimension2(2);
		/*System.out.println(((TwoDimensionalShape) s1).getLenght());
		System.out.println(((TwoDimensionalShape) s1).getWidth());
		System.out.println(((TwoDimensionalShape)s1).getArea());
		System.out.println(((TwoDimensionalShape)s1).toString());
		System.out.println(((TwoDimensionalShape)s1).getLenght());
		System.out.println(((TwoDimensionalShape)s1).getWidth());*/
		System.out.println(((TwoDimensionalShape)s1).toString());
	
		
		
		
		
		
		
		//Test the circle
		Shape s2 = new Circle(0,0,0);
		s2.setX(2);
		s2.setY(4);
		((TwoDimensionalShape)s2).setDimension1(3);
		((TwoDimensionalShape)s2).setDimension2(6);
		/*System.out.println(((TwoDimensionalShape)s2).getLenght());
		System.out.println(((TwoDimensionalShape)s2).getWidth());
		System.out.println(((TwoDimensionalShape)s2).getArea());*/
		System.out.println(((TwoDimensionalShape)s2).toString());
		
		
		
		
		
		
		//test the sphere
		Shape s4 = new Cube(0, 0, 0);
		s4.setX(4);
		s4.setY(9);
		((ThreeDimensionalShape)s4).setDimension1(5);
		((ThreeDimensionalShape)s4).setDimension2(5);
		((ThreeDimensionalShape)s4).setDimension3(5);
		/*System.out.println(((ThreeDimensionalShape)s4).getLenght());
		System.out.println(((ThreeDimensionalShape)s4).getWidth());
		System.out.println(((ThreeDimensionalShape)s4).getHeight());
		System.out.println(((ThreeDimensionalShape)s4).getArea());
		System.out.println(((ThreeDimensionalShape)s4).getVolume());*/
		System.out.println(((ThreeDimensionalShape)s4).toString());
		
		//test the sphere
		Shape s5 = new Sphere(0, 0, 0);
		
		s5.setX(6);
		s5.setY(5);
		((ThreeDimensionalShape)s5).setDimension3(8);
		((ThreeDimensionalShape)s5).setDimension2(7);
		((ThreeDimensionalShape)s5).setDimension1(5);
	/*	System.out.println(((ThreeDimensionalShape)s5).getLenght());
		System.out.println(((ThreeDimensionalShape)s5).getWidth());
		System.out.println(((ThreeDimensionalShape)s5).getHeight());
		System.out.println(((ThreeDimensionalShape)s5).getArea());
		System.out.println(((ThreeDimensionalShape)s5).getVolume());*/
		System.out.println(((ThreeDimensionalShape)s5).toString());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s4));
		
		
		
		
		
		
		
		
		
	}
}
