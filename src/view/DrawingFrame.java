package view;

import controller.DrawingController;
import javax.swing.JFrame;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel basePanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		
		setupFrame();
	
	}


	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(1000,1000);
		this.setTitle("HAIL SATAN!");
		this.setVisible(true);
		
	}



}
