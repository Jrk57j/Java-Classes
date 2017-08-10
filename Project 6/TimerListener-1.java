package gui.ball;
/**
 * A timer listener that will control the speed of the ball. 
 * @author Julian Itwaru
 * @version 1.0
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerListener implements ActionListener
{
	private Ball ball;
  
	public TimerListener(Ball ball)
	{
		this.ball = ball;
	}
  
	public void actionPerformed(ActionEvent e)
	{
		this.ball.repaint();
	}
}
