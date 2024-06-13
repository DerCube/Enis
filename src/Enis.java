import javax.swing.*;
import java.awt.*;
//GUI-Programmierung mit Swing


public class Enis extends JFrame {

        public static void main(String[] args) {
        Fenster fe = new Fenster();
        int x = 1; //wie oft
        for (int a = 0; a <x; a++) {


            for (int i = 0; i < 5; i++) {
                //Links
                fe.fenster(200 + (i * 60), 20);
                fe.fenster(200 + (5 * 60), 20 + (i * 60));
                fe.fenster(200 + (5 * 60) - (i * 60), 20 + (5 * 60));
                fe.fenster(200, 20 + (5 * 60) - (i * 60));

                fe.fenster(300 + (i * 20), 40);
                fe.fenster(300 + (5 * 60), 40 + (i * 60));
                fe.fenster(300 + (5 * 60) - (i * 60), 40 + (5 * 60));
                fe.fenster(300, 40 + (5 * 60) - (i * 60));

                fe.fenster(400, 40 + (i*50));
                //Rechts
                fe.fenster(200 + (i * 60), 450);
                fe.fenster(200 + (5 * 60), 450 + (i * 60));
                fe.fenster(200 + (5 * 60) - (i * 60), 450 + (5 * 60));
                fe.fenster(200, 450 + (5 * 60) - (i * 60));

                fe.fenster(300 + (i * 20), 450);
                fe.fenster(300 + (5 * 60), 450 + (i * 60));
                fe.fenster(300 + (5 * 60) - (i * 60), 450 + (5 * 60));
                fe.fenster(300, 450 + (5 * 60) - (i * 60));

                fe.fenster(400, 470 + (i*50));
                //vorne
                JFrame p = new JFrame();
                p.setSize(500, 200);
                p.setVisible(true);
                p.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                p.getContentPane().setBackground(new Color((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
                p.setLocation(300 + (i * 180), 350);
            }


        }
    }
}//end of all
