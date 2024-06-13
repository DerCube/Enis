import javax.swing.*;
import java.awt.*;

public class Fenster {
    public void fenster(int x,int y){

            JFrame f = new JFrame();
            f.setSize(100, 100);
            f.setVisible(true);
            f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            f.getContentPane().setBackground(new Color((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
            f.setLocation(x,y);

    }//fenster
}//end of all