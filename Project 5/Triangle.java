/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoShape;

/**
 * A triangle shape.
 * @author Julian Itwaru
 * @version 1.0
 */
public class Triangle extends GeometricObject
{
    //Initializes first side
    private int sideOne;
    //Initializes second side
    private int sideTwo;
    //Intel's third side
    private int sideThree;
    
    public Triangle() //throws IllegalTriangleException
    {
    	super();
        sideOne = 1;
        sideTwo = 1;
        sideThree = 1;
    } 
    
    /**
     * Enables propagation to test the triangle to see if it is a legal triangle. If the triangle passes the test than it will
     * create the triangle. If not it will catch the error and keep throw the error to keep the program from crashing. 
     * 
     * @param color
     * @param filled
     * @param sideOne
     * @param sideTwo
     * @param sideThree
     * @throws IllegalTriangleException
     */
    public Triangle(String color, boolean filled, int sideOne, int sideTwo, int sideThree) throws IllegalTriangleException
    {
    	super(color, filled);
    	try{
	    	if(!((sideOne+sideTwo) > sideThree && (sideTwo+sideThree) > sideOne && (sideOne+sideThree) > sideTwo)){ 
	    		throw new IllegalTriangleException("This is not a Triangle, Two sides must be greater than Other side.");
	    	}
	        
	        	this.sideOne = sideOne;
	            this.sideTwo = sideTwo;
	            this.sideThree = sideThree;
	     
    	}
    	catch(IllegalTriangleException ex)
    	{
    		ex.printStackTrace();
    		System.out.println("This is not a legal Triangle.");
    	}
        
       	finally
        {
        
        }
    }
    /**
     * Returns an Integer.
     * @return getSideOne A Integer Value of side one.
     */
    public int getSideOne()
    {
        return this.sideOne; 
    }
    /**
     * Changes an Integer.
     * @param sideOne Changes the actual value of Side oOne. 
     * @throws IllegalTriangleException 
     */
    public void setSideOne(int sideOne) throws IllegalTriangleException
    {
   
    {
    	if(!((sideOne+this.sideTwo) > this.sideThree && (this.sideTwo+this.sideThree) > sideOne && (sideOne+this.sideThree) > this.sideTwo)){ 
    		throw new IllegalTriangleException("This is not a Triangle, Two sides must be greater than Other side.");
    	}
        
        	this.sideOne = sideOne;
    }
    	
    }
    
    /**
     * Returns an Integer.
     * @return sideTwo Returns A Integer Value for side two.
     */
    public int getSideTwo()
    {
        return this.sideTwo;
    }
    /**
     * Changes an Integer.
     * @param sideTwo Changes the actual value of Side Two.
     * @throws IllegalTriangleException 
     */
    public void setSideTwo(int sideTwo) throws IllegalTriangleException
    {
    	if(!((this.sideOne+sideTwo) > this.sideThree && (sideTwo+this.sideThree) > this.sideOne && (this.sideOne+this.sideThree) > sideTwo)){ 
    		throw new IllegalTriangleException("This is not a Triangle, Two sides must be greater than Other side.");
    	}
        
        	
            this.sideTwo = sideTwo;
            
    }       
    
    /**
     * Returns an Integer.
     * @return sideTwo Returns A Integer for side three.
     */
    public int getSideThree()
    {
        return this.sideThree;
    }
    /**
     * Changes the Integer.
     * @param sideThree Changes the actual Integer for sideThree.
     */
    public void setSideThree(int sideThree)throws IllegalTriangleException
    {
    	if(!((this.sideOne+this.sideTwo) > sideThree && (this.sideTwo+sideThree) > this.sideOne && (this.sideOne+sideThree) > this.sideTwo)){ 
    		throw new IllegalTriangleException("This is not a Triangle, Two sides must be greater than Other side.");
    	}
        
        	
            this.sideThree = sideThree;
    
    }
    
    
    //calculates the perimeter of the triangle
    /**
     * 
     * @return getPerimeter() the perimeter of the triangle.  
     */
   public double getPerimeter()
   {
       double p = (sideOne + sideTwo + sideThree);
       return p;
       
   }
    
    //Calculates the area of the triangle
    /**
     * 
     * @return getArea() the area of the triangle.
     * 
     */
     public  double getArea()
      { 
    	/*double p = (this.sideOne + this.sideTwo + this.sideThree)/2;*/
    	
        double a = (int)Math.sqrt(getPerimeter()*(getPerimeter()-this.sideOne)*(getPerimeter() - this.sideTwo )*(getPerimeter() - this.sideThree));
        return a;
     }

     
    /**
     * A String literal that calls the super color and filled boolean and gives the details of the triangles area and perimeter. 
     * @return A String literal that calls the super color and filled boolean and gives the details of the triangles area and perimeter. 
     */
     public String toString()
    {
        return super.toString()+"The area is : " + this.getArea() +" The Perimeter is : "+ this.getPerimeter();
    }
    /**
     *  Indicated if object "equal to" other object. If object "is equal" to other
     * object return true. Else if object is "not equal" to other object return a false.
     * @param obj
     * @return equals Use the super to return true false statements. 
     */
    public boolean equals(Object obj)
    { 
     if(!(obj instanceof Triangle))
      {
        return false;
      }
    	Triangle other = (Triangle)obj;
    return super.equals(other);
    }
}   

