package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle>squareList;
	private ArrayList<Ellipse2D> elipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		
	}
	public void addRectangle()
	{

		int xPos = (int)(Math.random()* getWidth());
		int yPos = (int)(Math.random()* getHeight());
		int width = (int)(Math.random()* 100);
		int height = (int)(Math.random()*100);
		
		rectangleList.add(new Rectangle(xPos, yPos, width, height));
		
		repaint();
		
	}
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 9) +3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int side = 0; side < numberOfSides; side++)
		{
			xPoints[side] = (int)(Math.random() * 2000);
			yPoints[side] = (int)(Math.random() * 2000);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
	
	public void addSquare()
	{
		int xPos = (int)(Math.random()* getWidth());
		int yPos = (int)(Math.random()* getHeight());
		int width = (int)(Math.random()* 100);
		int height = width;	
		
		squareList.add(new Rectangle(xPos, yPos, width, height));
		
		repaint();
		
	}

	public void addElipse()
	{
		
	}

	public void addCircle()
	{
		
	}
	
	private void addTringle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * 150);
		xPoints[1] = (int)(Math.random() * 250);
		xPoints[2] = (int)(Math.random() * 350);
		
		int [] yPoints = {(int)(Math.random() * 150), (int)(Math.random() * 250), (int)(Math.random() * 350)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);

	}
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);

		Graphics2D mainGraphics = (Graphics2D) currentGraphics;

		mainGraphics.setStroke(new BasicStroke(10));
		mainGraphics.setColor(Color.DARK_GRAY);

		mainGraphics.drawRect(100, 300, 200, 100);

		for(Rectangle current: rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		for(Rectangle current: squareList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);	
		}		
	}
}
