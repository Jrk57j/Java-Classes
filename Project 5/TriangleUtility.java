package geoShape;

/*
 *This will test the triangle and set them into ArrayList. It will also catch any errors and throw them depending on the type or error.
 *
 */

import geoShape.IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

import geoShape.Triangle;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Julian
 */
public class TriangleUtility 
{
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IllegalTriangleException
	 */
    public static void triangleInfo() throws FileNotFoundException, IllegalTriangleException
    {	//Scanner will scan the text document. 
        Scanner scan = new Scanner(new File("data.txt"));
        //Initializes the ArrayList. 
        ArrayList<Triangle> triangles;
		//Makes a list of triangles.
		triangles = triangleList(scan);
		//Displays the list of triangles. 
		displayTriangles(triangles);
	}
        /**
         * 
         * @param scan
         * @return
         * @throws IllegalTriangleException
         */
        private static ArrayList<Triangle> triangleList(Scanner scan) throws IllegalTriangleException 
        {
        	
        	ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        	while(scan.hasNext())
        	{
        	try{
        		triangles.add(new Triangle(scan.next(), scan.nextBoolean(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
        	}
       /**
        * If the token passed is not an integer it will catch and throw the error. 	
        */
        catch(InputMismatchException ex) 
        {
        	ex.printStackTrace();
        	System.out.println("A token was passed that was not an Integer");
        }
            
        /**
         * If there is no token to be scanned than the it will catch and throw the error. 	
         */
        catch(NoSuchElementException ex)
        {
        	ex.printStackTrace();
        	System.out.println("No Token scanned.");
        }
        /**
         * If scanner is exhausted it will catch and throw the error. 
         */
        catch(IllegalStateException ex)
        {
        	ex.printStackTrace();
        	System.out.println("Scanner has exhausted all options.");
        }
        	
        
        	/**
        	 * Will allow the program to run and not catch due to errors. 
        	 */
           	finally
           	{
           		
           	}
        
        
       }
        	triangles.trimToSize();
			return triangles;
      } 	
	        
	        
        /**
         * Takes the triangles that have been added into the ArrayList and display them. 
         * @param triangles
         */
    	private static void displayTriangles(ArrayList<Triangle> triangles)
		{
			for(int i = 0; i < triangles.size(); i++)
			{
				System.out.println(triangles.get(i).toString());
			}
			
		}
} 