import java.awt.*; 
import java.util.Random;
import java.util.*;
import javax.swing.*;

public class glass {
    private Random r = new Random();
    ArrayList<ArrayList<dot>> big = new ArrayList<ArrayList<dot>>();
    ArrayList<color> c= new ArrayList<color>();
    ArrayList<dot> empty = new ArrayList<dot>();
    //graphics g = new graphics();
    // ArrayList<dot> glass1 = new ArrayList<dot>();
    // ArrayList<dot> glass2 = new ArrayList<dot>();
    // ArrayList<dot> glass3 = new ArrayList<dot>();
    // ArrayList<dot> glass4 = new ArrayList<dot>();
    // ArrayList<dot> glass5 = new ArrayList<dot>();
    // ArrayList<dot> glass6 = new ArrayList<dot>();
   
    public glass(){
       
        int temp = 0;
        c.add(new color(Color.green,4));
        c.add(new color(Color.blue,4));
        c.add(new color(Color.yellow,4));
        c.add(new color(Color.red,4));
        c.add(new color(Color.pink,4));
        while (temp < 6){
            big.add(new ArrayList<dot>() );
            temp++;
        }
        fillGlasses(5);
        big.add(empty);
       
        
    }
    

    public void fillGlasses(int glassNum){
        int x=0;
        int y=0;
        for(ArrayList<dot> l:big){
            int temp = 0;
            while (temp < 5){
                l.add(new dot(chooseColor(), x, y));
                temp ++;
            }
        }
    }    
   
    public Color chooseColor(){
        int rand = r.nextInt(c.size());
        int num = 0;
        Color co = Color.black;
        while (c.get(rand).getNumColor() == 0){
            rand = r.nextInt(c.size());
            num=c.get(rand).getNumColor()-1;
            co=c.get(rand).getColor();
        }
        c.set(rand, new color(co,num));
        return c.get(rand).getColor();
    }

  
    
}
