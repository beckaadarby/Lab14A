// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
  private int x;
  private int y;
  private int s;
   public void drawShape(Graphics g)
   {
     Polygon octagon = new Polygon();
     octagon.addPoint(123,330);
     octagon.addPoint(60,396);
     octagon.addPoint(60,462);
     octagon.addPoint(123,530);
     octagon.addPoint(186,530);
     octagon.addPoint(250,462);
     octagon.addPoint(250,396);
     octagon.addPoint(186,330);
     g.setColor(Color.black);
     g.fillPolygon(octagon);
   }
   public void displayName(Graphics g){
     int x = 20;
     int y = 320;
     g.drawString("Octagon", x, y);
   }
   public void displayNumSides(Graphics g){
     int s = 8;
     int x = 20;
     int y = 560;
     g.drawString("An octagon has " + s + " sides",x,y);
   }
}
