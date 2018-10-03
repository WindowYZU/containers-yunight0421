/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.containers;

import java.awt.BorderLayout;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class SplashScreenSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //init the JWindow, add component to its content pane
        JWindow window=null;
        ImageIcon icon=new ImageIcon(new URL("https://i.ytimg.com/vi/ND6a4V-xdjI/hqdefault.jpg"));
        
        //////////////////////////////////////////////////////
        
        Thread t=new Thread(){
            public void run(){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SplashScreenSample.class.getName()).log(Level.SEVERE, null, ex);
                }
                window.setVisible(false);
                frame.setVisible(true);
            }
        };
        t.start();
        window.setVisible(true);
    }
    
}
