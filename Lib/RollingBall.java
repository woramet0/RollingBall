package Lib;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class RollingBall extends JPanel {

    private int x = 100;
    private int y = 100;
    private int radius = 50;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, radius, radius);
    }