package Lib;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingBall extends JPanel implements ActionListener { 

    private int x = 100;
    private int y = 90;
    private int radius = 50;
    private Timer timer;
    public RollingBall(){
        timer = new Timer(20,this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.Red);
        g.fillOval(x, y, radius, radius);
    }
    @Override
    public void actionPerformed(ActionEvent e ){
        x+=2;
        if (x > getWidth()){
            x=-radius;
        }
        repaint();
    }
}