/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoShape;

/**
 *Represents a Geometric Shape.
 * @author Julian Itwaru.
 * @version 1.0
 */
public abstract class GeometricObject {

    
    //inilizes a Shape Color
    private String color;
    //Fill boolean for color
    private boolean filled;
    
    //Default constructor
    public GeometricObject()
    {
        this.color = "white";
        this.filled = false;
    }
    //OverLoaded Constructor 
    /**
     * 
     * 
     * @param color 
     * @param filled
     */
    public GeometricObject(String color, boolean filled)
    {
       
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * Returns a color for shape.
     * @return getColor Returns a Color of shape.
     */
    public String getColor()
    {
        return this.color;
    }
    /**
     * Changes the color of a shape.
     * @param color Changes the actual color of a shape. 
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    //not too sure what to do here.
    public boolean isFilled()
    {
        return filled;
    }
    //not too sure what to do here.
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
    /**
     * Returns a String Literal of a shape.
     * @return toString A String Literal of shape.
     */
    public String toString()
    {
        return this.color +" "+ this.filled;
    }
    /**
     * Indicated if object "equal to" other object. If object "is equal" to other
     * object return true. Else if object is "not equal" to other object return a false.
     * @param obj
     * @return equals
     */
    @Override
    public boolean equals(Object obj)
    { 
     if(!(obj instanceof GeometricObject))
      {
        return false;
      }
    	GeometricObject other = (GeometricObject)obj;
    return this.color == other.color;
    }	
}
