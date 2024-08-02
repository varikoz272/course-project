package com.varikoz272.ui.course.component;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class NiceButton extends JButton {

    private boolean isPressed;
    private boolean isEntered;

    public NiceButton(String message) {
        setText(message);
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setBackground(new Color(0x4DC7FF));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorder(new EmptyBorder(10, 20, 10, 20));
        setFocusable(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                isEntered = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                isEntered = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                isPressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                isPressed = false;
            }

        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // int width = getWidth();
        // int height = getHeight();
        // BufferedImage img = new BufferedImage(width, height,
        // BufferedImage.TYPE_INT_ARGB);
        // Graphics2D g2 = img.createGraphics();
        // g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        // RenderingHints.VALUE_ANTIALIAS_ON);
        //
        // GradientPaint gra = new GradientPaint(0, 0, isPressed ? color1.darker() :
        // color1, width, 0, color2);
        // g2.setPaint(gra);
        //
        // g2.fillRoundRect(0, 0, width, height, height, height);
        // g2.dispose();
        // g.drawImage(img, 0, 0, null);

        paintUntouched((Graphics2D) g);
        super.paintComponent(g);
    }

    protected void paintUntouched(Graphics2D g2) {
        g2.setColor(getBackground().darker());
        g2.fillRoundRect(0, 5, getWidth(), getHeight() - 5, getHeight(), getHeight());

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight() - 5, getHeight(), getHeight());
    }
}
