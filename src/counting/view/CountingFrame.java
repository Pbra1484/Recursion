package counting.view;

import javax.swing.JFrame;
import counting.controller.CountingController;
import java.awt.Dimension;

public class CountingFrame extends JFrame 
{
	
	private CountingController baseController;
	private CountingPanel appPanel;
	
	public CountingFrame(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new CountingPanel(baseController);
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Stuff");
		this.setSize(new Dimension(600, 400));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
