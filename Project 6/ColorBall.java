package gui.moreBalls;
/**
 * A representation of a colored ball. 
 * 
 * @author Julian Itwaru
 * @version 1.0
 */
import java.awt.Color;

public class ColorBall 
{
	//initializes the x value
	private int x;
	//initializes the y value
	private int y;
	//initializes the dx value
	private int dx;
	//initializes the dy value
	private int dy;
	//initializes the color for the ball, because red balls are boring. 
	private Color color;
	
	/**
	 * Constructor for the ColorBall
	 * @param x. 
	 * @param y.
	 * @param dx.
	 * @param dy
	 * @param color.
	 */
	public ColorBall()
	{
		this.x = 10;
		this.y = 10;
		this.dx = 5;
		this.dy = 5;
		this.color = new Color((int)(Math.random() * 256.0D), (int)(Math.random() * 256.0D), 
			      (int)(Math.random() * 256.0D));
		
	}
	/**
	 * Returns the dimension for the ball. 
	 * @return x. Gets the dimension for the ball. 
	 */
	public int getX()
	{
		return this.x;
	}
	
	/**
	 * Returns the y dimension for the ball. 
	 * @return y. Gets the dimension for the ball. 
	 */
	public int getY()
	{
		return this.y;
	}
	/**
	 * Returns the slope of the ball. 
	 * @return dx. Returns the slope of the balls travel path. 
	 */
	public int getDX()
	{
		return this.dx;
	}
	/**
	 * Returns the slope of the ball. 
	 * @return dy. Returns the slope of the balls travel path. 
	 */
	public int getDY()
	{
		return this.dy;
	}
	/**
	 * Returns the color of the ball. 
	 * @return getColor(). Returns the color of the ball at random. 
	 */
	public Color getColor()
	{
		return this.color;
	}
	/**
	 * Changes the value of the x dimension. 
	 * @param x. Changes the value of the x dimension for the ball. 
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	/**
	 * Changes the value of the y dimension.
	 * @param y Changes the value of the y dimension for the ball. 
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	/**
	 * Changes the slope of the balls travel path.
	 * @param dx Changes the slope of this balls travel path along the x axis. 
	 */
	public void setDX(int dx)
	{
		this.dx = dx;
	}
	/**
	 * Changes the slope of the balls travel path.
	 * @param dy Changes the slope of this balls travel path along the y axis. 
	 */
	public void setDY(int dy)
	{
		this.dy = dy;
	}
	/**
	 * Changes the color of the ball.
	 * @param color Changes the color of the ball at random when added into the array list. 
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
}
