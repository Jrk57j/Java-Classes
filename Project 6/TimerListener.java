package gui.moreBalls;
/**
 * Timer listener that will control the speed of the ball or balls.
 * @author Julian Itwaru
 * @version 1.0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerListener implements ActionListener
{
	private Ball ball;
	/**
	 * 
	 * @param ball
	 */
	public TimerListener(Ball ball)
	{
		this.ball = ball;
	}

	public void actionPerformed(ActionEvent e)
	{
		this.ball.repaint();
	}
}
