package gui.moreBalls;
/**
 * A frame for the balls.
 * @author Julian Itwaru
 * @version 1.0
 */
import javax.swing.JFrame;

public class BallFrame extends JFrame
{
	 private JFrame ballFrame;
		  
	 public BallFrame()
	{	
		 //creates a new frame for the ball control panel.
		 this.ballFrame = new JFrame();
		 //Adds the minimize, exit, and closes the frame completely.
		 this.ballFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //sets the title of the frame.
		 this.ballFrame.setTitle("Bouncing ball");
		 //sets the orientation of the frame. 
		 this.ballFrame.add(new BallControl(), "Center");
		 //the size of the frame and the amount of pixels it will take up. 
		 this.ballFrame.setSize(500, 400);
		 //sets the frame to be visible. 
		 this.ballFrame.setVisible(true);
		 //keeps the frame from being resized
		  this.ballFrame.setResizable(false);
	}
}
