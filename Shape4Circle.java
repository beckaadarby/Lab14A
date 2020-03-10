// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
  private int x;
  private int y;
  private int s;
   public void drawShape(Graphics g)
   {
     g.setColor(Color.black);
     g.fillOval(550,400,150,150);
   }
   public void displayName(Graphics g){
     int x = 430;
     int y = 320;
     g.drawString("Circle", x, y);
   }
   public void displayNumSides(Graphics g){
     int s = 0;
     int x = 430;
     int y = 560;
     g.drawString("A circle has " + s + " sides",x,y);
   }
}
