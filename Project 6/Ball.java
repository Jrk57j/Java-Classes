package gui.moreBalls;
/**
 * Creates a control for the ball so that the ball can become viable and controlled through the user. 
 * 
 * @author julian Itwaru
 * @version 1.0
 */
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Ball extends JPanel
{
	//Initializes the arraylist 
	private ArrayList<ColorBall> bList;
	//initializes the radius 
	private int radius;
	//initializes the timer
	private Timer timer;


	/**
	 * Constructor for the ball. 
	 * @param bList. An Arraylist for the ball.
	 * @param radius. A double integer for the ball. 
	 * @param timer. The speed of the ball. And the start of the object. 
	 */
	public Ball()
	{
		this.bList = new ArrayList();
		this.radius = 10;
		this.timer = new Timer(100, new TimerListener(this));
		this.timer.start();
	}
	
	/**
	 * Adds the ball to the array list. 
	 */
	public void add()
	{
		this.bList.add(new ColorBall());
			
	}
	
	/**
	 * Subtracts the ball from the array list.
	 * @param subtract. 
	 */
	public void subtract()
	{
		if(this.bList.size() > 0)
		{
			this.bList.remove(this.bList.size() -1);
		}
	}
	
	/* 
	 *
	/**
	 * Adds the ball and colors the object. 
	 * @param paintedComponet.
	 */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0; i < this.bList.size(); i++)
		{
			ColorBall b = (ColorBall)this.bList.get(i);
			g.setColor(b.getColor());
			if(b.getX() < this.radius)
			{
				b.setDX(+(b.getDX()));
				b.setDX(-(b.getDX()));
			}
			else if(b.getX() > getWidth() - this.radius)
			{
				b.setDX(-(b.getDX()));
				b.setDX(+(b.getDX()));
			}
			else if(b.getY() < this.radius)
			{
				b.setDY((b.getDY()));
				b.setDY(-b.getDY());
			}
			else if(b.getY() > getHeight() - this.radius)
			{
				b.setDY(-(b.getDY()));
				b.setDY(+(b.getDY()));
			}
			b.setX(b.getX() + b.getDX());
			b.setY(b.getY() + b.getDY());
			g.fillOval(b.getX() - this.radius, b.getY() - this.radius, this.radius*2, this.radius *2);
			
				
		}
	}	 
	/**
	 * Stops the timer to freeze the ball in motion. 
	 * @param suspend. 
	 */
	public void suspend()
	{
		this.timer.stop();
	}
	/**
	 * Allows the ball to continue its motion. 
	 * @param resume.
	 */
	public void resume()
	{
		this.timer.start();
	}
	/**
	 * Speed delay from the scroll bar. Can change the speed of the ball. 
	 * @param delay
	 */
	public void setDelay(int delay)
	{
		this.timer.setDelay(delay);
	}
	
}
