package gui.moreBalls;
/**
 * Adjustment for the balls speed through a scroll bar. 
 * 
 * @author Julian Itwaru
 * @version 1.0
 */
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;

public class BarListener implements AdjustmentListener 
{
	private Ball ball;
	private JScrollBar bar;	  
	/**
	 * 	
	 * @param ball
	 * @param bar
	 */
	public BarListener(Ball ball, JScrollBar bar)
	{
		 this.ball = ball;
		 this.bar = bar;
    }  	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
	 this.ball.setDelay(this.bar.getMaximum() - e.getValue());
	}
}
