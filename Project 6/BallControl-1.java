package gui.ball;
/**
 * Controls for the ball. Allows the user to control the ball. 
 * @author Julian
 * @version 1.0
 */

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;

public class BallControl extends JPanel
{
		//initializes the ball object from the ball class
		private Ball ball;
		//initializes the sspend button from the javax.swing.JButton 
		private JButton suspend;
		//initializes the resume button from the javax.swingJButton
		private JButton resume;
		//initializes the delay bar for the speed control from the javac.swing.JScrollBar
		private JScrollBar delayBar;
  
	public BallControl()
	{
		//uses the ball class to create a ball. 
		this.ball = new Ball();
		//adds a button for the user to suspend the object ball
		this.suspend = new JButton("Suspend");
		//adds a button for the user to resume the suspended object ball
		this.resume = new JButton("Resume");
		//adds in the scroll bar for the user to control the speed of the ball
		this.delayBar = new JScrollBar();
		//sets the new panel for the objects to hold into
		JPanel panel = new JPanel();
		//adds the suspend button to the panel
		panel.add(this.suspend);
		//adds the resume button to the panel
		panel.add(this.resume);
		//adds the action listener to the panel so that the button will actually pause the ball
		this.suspend.addActionListener(new ButtonListener(this.ball));
		////adds the action listener to the panel so that the button will actually resume the ball
		this.resume.addActionListener(new ButtonListener(this.ball));
		//sets the border inside of the panel
		this.ball.setBorder(new LineBorder(Color.red));
		//sets where the scroll bar will sit inside of the panel 
		this.delayBar.setOrientation(0);
		//gives the scroll bar slider values for when it is slided left to right it will increase or decrease the speed of the ball
		this.delayBar.addAdjustmentListener(new BarListener(this.ball, this.delayBar));
		//sets the speed of the ball 
		this.ball.setDelay(this.delayBar.getMaximum());
		setLayout(new BorderLayout());
		this.add(this.delayBar,"North");
		this.add(this.ball, "Center");
		this.add(panel, "South");
	}
	//a getter for the scroll bar to chane the speed of the timer.
	public JScrollBar getDelayBar()
	{
		return this.delayBar;
	}
}
