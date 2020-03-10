// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
	private ArrayList<Shape> shapes;
	public void paint(Graphics g)
	{
		drawGrid(g);
		ArrayList <Shape> shapes = new ArrayList<Shape>();
		//add all the pieces to the array list
		Shape square = new Shape1Square();
		Shape triangle = new Shape2Triangle();
		Shape octagon = new Shape3Octagon();
		Shape circle = new Shape4Circle();
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(octagon);
		shapes.add(circle);
		for (int k=0; k<shapes.size(); k++){
			shapes.get(k).drawShape(g);
			shapes.get(k).displayName(g);
			shapes.get(k).displayNumSides(g);
		}

}
	public void drawGrid(Graphics g)
	{
      g.drawRect(10,10,800,600);
		g.drawLine(10,300,810,300);
		g.drawLine(410,10,410,610);
	}
	}
