package gui.ball;
/**
 * A Bar event listner that will change the speed of the ball. 
 * @author Julian Itwaru
 * @version 1.0
 * 
 */
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;

public class BarListener implements AdjustmentListener
{
	//initializes the ball from the ball class
	private Ball ball;
	//initializes the JScrollBar from the javax.swing.JScrollBar 
	private JScrollBar bar;
  
	public BarListener(Ball ball, JScrollBar bar)
	{
		this.ball = ball;
		this.bar = bar;
	}
	//changes the value of the scrll bar when moved from left to right. 
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		this.ball.setDelay(this.bar.getMaximum() - e.getValue());
	}
}
