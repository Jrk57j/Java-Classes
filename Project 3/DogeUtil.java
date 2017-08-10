/**
 * @author Julian
 * @version 1.0
 */
package doge;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



import doge.Doge;


public class DogeUtil 
{

	public static void dogeFile() throws FileNotFoundException 
	{
		
		ArrayList<Doge> doges;
		Scanner scan = new Scanner(new File ("doge.txt"));
		
		doges = dogeList(scan);
		
		displayDoge(doges);
		
		//Display  information
				for( int i =0;  i < doges.size(); i++){
					Doge e = doges.get(i);
					System.out.println(e.BreedWeight());
					if(e instanceof EpicDoge){
						System.out.println(((EpicDoge)e).getDogeType());
					}
					else if(e instanceof FailDoge){
						System.out.println(((FailDoge)e).getDogeType());
					}
					
				}
	}	
		
		private static ArrayList<Doge> dogeList(Scanner scan)
		{
				ArrayList<Doge> doges = new ArrayList<Doge>();
				while(scan.hasNext())
				{
					String type = scan.next();
					if(type.equals("LABRADOR"))
					{
						EpicDoge lab = new EpicDoge(scan.next(), scan.next());
						doges.add(lab);
					}
					else 
					{
						doges.add(new FailDoge(scan.nextLine()));
					}
				}
				doges.trimToSize();
				return doges;
		}
		
/*		private static ArrayList<Doge> createList(ArrayList<Doge> doges)
		{
			Doge doges1 = new Doge();
			
			for(int i = 0; i < doges.size(); i++)
			{
				 doges1.addDoge(doges.get(i));
			}
			return doges;
		}*/
		
		private static void displayDoge(ArrayList<Doge> doges)
		{
			for(int i = 0; i < doges.size(); i++)
			{
				System.out.println(doges.get(i).toString());
			}
			
		}	
}