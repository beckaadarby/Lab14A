// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
  private int x;
  private int y;
  private int s;

   public void drawShape(Graphics g)
   {
     g.setColor(Color.black);
     g.fillRect(100,100,150,150);
   }
   public void displayName(Graphics g){
     int x = 50;
     int y = 50;
     g.drawString("Square", x, y);
   }
   public void displayNumSides(Graphics g){
     int s = 4;
     int x = 20;
     int y = 280;
     g.drawString("A square has " + s + " sides",x,y);
   }
}
