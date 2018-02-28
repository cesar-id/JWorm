package graphics;

import javax.swing.*;

public class Window extends JFrame {

    private Screen screen;

    // Creates the game window
    public Window(){

        screen = new Screen();
        add(screen);

        setSize(800,800);

        setTitle("Java Worm v0.1");
        System.out.println("Java Worm v0.1");

        setVisible(true);
    }

    public static void main(String[] args){
        new Window();
    }

}
