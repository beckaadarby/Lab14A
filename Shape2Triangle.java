// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
  private int x;
  private int y;
  private int s;
   public void drawShape(Graphics g)
   {
     Polygon triangle = new Polygon();
     triangle.addPoint(600,100);
     triangle.addPoint(500,250);
     triangle.addPoint(700,250);
     g.setColor(Color.black);
     g.fillPolygon(triangle);
   }
   public void displayName(Graphics g){
     int x = 450;
     int y = 65;
     g.drawString("Triangle", x, y);
   }
   public void displayNumSides(Graphics g){
     int s = 3;
     int x = 430;
     int y = 280;
     g.drawString("A triangle has " + s + " sides",x ,y);
   }
}
