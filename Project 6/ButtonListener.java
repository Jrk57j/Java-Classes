package gui.moreBalls;
/**
 * Event listener that will add and subtract balls from the arraylist. 
 * Event listener that will stop and resume the ball. 
 * @author Julian Itwaru
 * @version 1.0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonListener implements ActionListener
{
	//initializes the ball from the ball class
	private Ball ball;
	//creates a listener for the button on the ball
	public ButtonListener(Ball ball)
	{
		this.ball = ball;
	}
	//the action performed for the event listener. 
	public void actionPerformed(ActionEvent e)
	{
		if (((JButton)e.getSource()).getText().equals("Suspend")) 
		{
			this.ball.suspend();
		}
		if (((JButton)e.getSource()).getText().equals("Resume")) 
		{
			this.ball.resume();
		}
		if(((JButton)e.getSource()).getText().equals("+1"))
		{
			this.ball.add();
		}
		if(((JButton)e.getSource()).getText().equals("-1"))
		{
			this.ball.subtract();
		}
	}
}