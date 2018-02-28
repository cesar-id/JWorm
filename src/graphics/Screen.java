package graphics;

import sun.print.PeekGraphics;

import javax.swing.*;
import java.awt.*;

class Screen extends JPanel {


    public Screen(){
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.drawRect(100,100,100,100);
        g.fillRect(100, 100,100,100);
    }

}