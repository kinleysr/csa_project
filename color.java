import java.awt.*;
public class color {
    Color color = Color.white;
    int num = 0;
    public color(Color c, int quant){
        Color color = c;
        num = quant;
    }

    public Color getColor(){
        return color;
    }
    public int getNumColor(){
        return num;
    }
}
