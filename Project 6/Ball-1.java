package gui.ball;
/**
 * Creates a ball for the ball JPanel
 * @author Julian Itwru
 * @version 1.0
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Ball extends JPanel
{
	//initializes the x value for the ball
	private int x;
	//initializes the y value for the ball
	private int y;
	//initializes the horizontal movement for the x-axis
	private int dx;
	//initializes the vertical movement for the y-axis
	private int dy;
	//initializes the radius of the ball
	private double radius;
	//initializes the speed for the ball movement
	private Timer timer;
  
	public Ball()
	{
		this.timer = new Timer(100, new TimerListener(this));
		this.x = 10;
		this.y = 10;
		this.radius = 10;
		this.dx = 5;
		this.dy = 5;
		this.timer.start();
	}
  
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);//very first step you need to do in order for stuff to be viewable 
		g.setColor(Color.red);
		if(this.x > this.getWidth() - 2 * this.radius || this.x < 0){
			this.dx= (- this.dx);
			this.x =(this.x + this.dx);
			g.fillOval(this.x, this.y, (int)this.radius * 2, (int)this.radius* 2);
		}	
		else
		{
			g.fillOval(this.x, this.y, (int)this.radius * 2, (int)this.radius * 2);
		}
		if(this.y > this.getHeight() - 2 * this.radius || this.y < 0){
			this.dy= (- this.dy);
			this.y =(this.y + this.dy);
			g.fillOval(this.x, this.y, (int)this.radius * 2, (int)this.radius* 2);
		}else
		{
		g.fillOval(this.x, this.y, (int)this.radius * 2, (int)this.radius * 2);
	}
	
	
		this.x = this.x + this.dx;//moves ball along the xaxis 
		this.y = this.y +this.dy;//moves ball along the y axis

	}
	//suspends the ball
	public void suspend()
	{
		this.timer.stop();
	}
	//resumes the ball
	public void resume()
	{
		this.timer.start();
  	}
	//sets the timer delay by the scroll bar 
	public void setDelay(int delay)
  	{
	  this.timer.setDelay(delay);
  	}
}