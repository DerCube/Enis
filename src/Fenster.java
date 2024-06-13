import javax.swing.*;
import java.awt.*;

public class Fenster {
    JLabel lable;
    JPanel pan;
    public void fenster(int x,int y){

            JFrame f = new JFrame();
            f.setSize(100, 100);
            f.setVisible(true);
            f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            pan =new JPanel();
            lable =new JLabel("Guten tag das ist ein Muster das nichts darstellt");
            f.add(pan);
            pan.add(lable);
            pan.setBackground(new Color((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
            f.setLocation(x,y);

    }//fenster
}//end of all