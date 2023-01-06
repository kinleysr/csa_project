
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.*;


public class MyGraphics extends JPanel implements MouseListener{
    //glass Glass = new glass();
   private int myWindowWidth = 1000;
   private int myWindowHeight = 500;
   private int clickedX;
   private int clickedY;
   glass gl = new glass();
	
   public MyGraphics() {
      //System.out.println("start");
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      addMouseListener(this);
      easel.setVisible (true);
      //System.out.println("y");

      
   }
	
   public void paintComponent (Graphics g) {
   super.repaint();
   setUp(g);
   //System.out.println("xxx");
   //  drawGlass(g, 200, Color.black);
   //  drawDot(g, Color.pink,203 , 350);
   }

   public void drawGlass(Graphics g, int xpos){
    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(7));
    
    g2.drawLine(xpos, 400,xpos, 150);
    g2.drawLine(xpos, 400, xpos+50,400);
    g2.drawLine(xpos+50, 400, xpos+50, 150);
    // g.setColor(c);
    // g2.drawString("...", 100, 100);
    // g2.fillOval(xpos, 50, 140, 140);
   }
//    public void drawDot(Graphics g, Color c, int xpos, int ypos){
//     Graphics2D g2 = (Graphics2D) g;
//     g2.setStroke(new BasicStroke(7));

//    }
   public void drawDot(Graphics g, Color c, int xpos, int ypos){
        g.setColor(c);
        g.fillOval(xpos, ypos, 43, 43);
   }
   public void fillGlass(Graphics g, int glassNum){
      int temp = 0;
      while (temp < 5){
        drawDot(g, gl.chooseColor(), glassNum*100+4, 400-((temp+1)*43 + 5));
         temp++;
      }
   }

   public void mousePressed (MouseEvent event) {
      this.clickedY = event.getY();
      this.clickedX = event.getX();
   }
   public void setUp(Graphics g){
      int temp = 0;
      ArrayList<ArrayList<dot>> dlist = new ArrayList<ArrayList<dot>>();
      dlist = gl.getDotList();

      for(ArrayList<dot> l: dlist){
         for (dot d: l){
            drawGlass(g, temp*100);
            fillGlass(g, temp);
         }
         temp++;
      }
   }
      // while (temp < 6){
      //    drawGlass(g, temp*100, gl.chooseColor());
      //    fillGlass(g, temp);
      //    temp++;
      // }

      
   
   public void mouseClicked(MouseEvent event){

   }
     
   public void mouseReleased (MouseEvent event) {
   }

   public void mouseEntered (MouseEvent event) {
   }
   
   public void mouseExited (MouseEvent event) {
   }
}