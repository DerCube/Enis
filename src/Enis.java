import javax.swing.*;
import java.awt.*;
//GUI-Programmierung mit Swing
public class Enis extends JFrame {


    public Enis(){
        super("Wer das liest hat einen Kleinen Pullerman"); //Tietel des Fensters

    }//end of Constructor

    public static void main(String[] args) {

        int y = 30;
        for (int i = 0; i < y; i++) {
            JFrame f =new JFrame();
            f.setSize(100,100);
            f.setVisible(true);
            f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            f.setLocation(200+(i*10),20);

        }

        int e = 30;
        for (int i = 0; i < e; i++) {
            JFrame f =new JFrame();
            f.setSize(100,100);
            f.setVisible(true);
            f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            f.setLocation(200+(30*10),20+(i*10));

        }

        int l = 30;
        for (int i = 0; i < l; i++) {
            JFrame f =new JFrame();
            f.setSize(100,100);
            f.setVisible(true);
            f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            f.setLocation(200+(30*10)-(i*10),20+(30*10));

        }


        int ur = 31;
        for (int i = 0; i < ur; i++) {
            JFrame f = new JFrame();
            f.setSize(100, 100);
            f.setVisible(true);
            f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            f.setLocation(200, 20 + (30 * 10) - (i * 10));
        }

            //Rechtes Ei

            int yr = 30;
            for (int i = 0; i < yr; i++) {
                JFrame f =new JFrame();
                f.setSize(100,100);
                f.setVisible(true);
                f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                f.setLocation(200+(i*10),20+(400));

            }

            int er = 30;
            for (int i = 0; i < er; i++) {
                JFrame f =new JFrame();
                f.setSize(100,100);
                f.setVisible(true);
                f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                f.setLocation(200+(30*10),20+(i*10)+(400));

            }

            int lr = 30;
            for (int i = 0; i < lr; i++) {
                JFrame f =new JFrame();
                f.setSize(100,100);
                f.setVisible(true);
                f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                f.setLocation(200+(30*10)-(i*10),20+(30*10)+(400));

            }


            int or = 31;
            for (int i = 0; i < or; i++) {
                JFrame f = new JFrame();
                f.setSize(100, 100);
                f.setVisible(true);
                f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                f.setLocation(200, 20 + (30 * 10) - (i * 10)+(400));
            }


        int x = 100;
        for (int i = 0; i < x; i++) {
            JFrame f =new JFrame();
            f.setSize(200,200);
            f.setVisible(true);
            f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            f.setLocation(300+(i*10),320);

        }


    }

}//end of all
