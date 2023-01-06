import java.awt.*; 
import java.util.Random;
import java.util.*;
import javax.swing.*;

public class glass {
    private Random r = new Random();
    ArrayList<ArrayList<dot>> big = new ArrayList<ArrayList<dot>>();
    ArrayList<color> c= new ArrayList<color>();
    ArrayList<dot> empty = new ArrayList<dot>();
    // ArrayList<dot> glass1 = new ArrayList<dot>();
    // ArrayList<dot> glass2 = new ArrayList<dot>();
    // ArrayList<dot> glass3 = new ArrayList<dot>();
    // ArrayList<dot> glass4 = new ArrayList<dot>();
    // ArrayList<dot> glass5 = new ArrayList<dot>();
    // ArrayList<dot> glass6 = new ArrayList<dot>();
   
    public glass(){
       //System.out.println("x");
        int temp = 0;
        int x = 0;
        while(x!=4){
            c.add(new color(Color.green));
            x++;
        }
        x=0;
        while(x!=5){
            c.add(new color(Color.blue));
            x++;
        }
        x=0;
        while(x!=5){
            c.add(new color(Color.yellow));
            x++;
        }
        x=0;
        while(x!=5){
            c.add(new color(Color.red));
            x++;
        }
        x=0;
        while(x!=5){
            c.add(new color(Color.pink));
            x++;
        }
        x=0;

        while (temp < 6){
            big.add(new ArrayList<dot>() );
            temp++;
            x++;
            //System.out.println("xx");
        }
        
        big.add(empty);
        fillGlasses(5);
        //System.out.println("x");
       
        
    }
    public ArrayList getDotList(){
        return big;
    }
    

    public void fillGlasses(int glassNum){
        int x=0;
        int y=0;
        //System.out.println(big.size());
        for(ArrayList<dot> l:big){
            int temp = 0;
           // System.out.println("yy");
            while (temp < 5){
               l.add(new dot(chooseColor(), x, y));
                temp ++;
                //System.out.println(temp);
            }
        }
    }    
   
    public Color chooseColor(){
        if (c.size()>0){
        System.out.println(c.size());
        int rand = r.nextInt(c.size());
        return c.remove(rand).getColor();
    }
        return Color.black;
    
        // System.out.println(c.size());
        // while (c.get(rand).getNumColor() == 0){
        //     rand = r.nextInt(c.size());
       
        // }
        // c.get(rand).decreaseByOne();
        
    }

  
    
}
