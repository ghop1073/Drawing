package view;

import javax.swing.*;
import controller.DrawingController;

public class DrawingFrame extends JFrame
{

	private DrawingPanel basePanel;
	private DrawingController baseController;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Drawing stuff in Java");
		this.setSize(800,800);
		this.setVisible(true);
	}
}
