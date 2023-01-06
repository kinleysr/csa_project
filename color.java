import java.awt.*;
public class color {
    Color color = Color.white;
    int num = 0;
    public color(Color c){
        color = c;
        //num = quant;
    }

    public Color getColor(){
        return color;
    }
    public int getNumColor(){
        return num;
    }

    public void decreaseByOne(){
        num -= 1;
    }
}
