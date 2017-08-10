package shape;
import shape.Shape;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

/**
 * @author Julian
 *
 */
public class ShapeUtility 
{
		/**
		 * @throws FileNotFoundException
		 */
		public static void Shapes() throws FileNotFoundException
		{
			
			ArrayList<Shape> shapes;
			
			Scanner scan = new Scanner(new File("data.txt"));
			
			shapes = shapeList(scan);
			
			displayShape(shapes);
		}			
			private static ArrayList<Shape> shapeList(Scanner scan)
			{
					ArrayList<Shape> shapes = new ArrayList<Shape>();
					while(scan.hasNext())
					{
						String data = scan.next();
						if(data.equalsIgnoreCase("Circle"))
						{
							Circle circle = new Circle(scan.nextInt(), scan.nextInt(), scan.nextInt());
							shapes.add(circle);
						}
						else if(data.equalsIgnoreCase("Square"))
						{
						
							shapes.add(new Square(scan.nextInt(), scan.nextInt(), scan.nextInt()));
						}
						else if(data.equalsIgnoreCase("Sphere"))
						{
							shapes.add(new Sphere(scan.nextInt(), scan.nextInt(), scan.nextInt()));
						}
						else if(data.equalsIgnoreCase("Cube"))
						{
							shapes.add(new Cube(scan.nextInt(), scan.nextInt(), scan.nextInt()));
						}
						
					}
					
					shapes.trimToSize();
					return shapes;
					
			} 
		
			private static void displayShape(ArrayList<Shape> shapes)
			{
				for(int i = 0; i < shapes.size(); i++)
				{
					System.out.println(shapes.get(i).toString());
				}
				
			}
			
			
			
}	