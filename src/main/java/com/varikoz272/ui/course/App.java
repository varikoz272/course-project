package com.varikoz272.ui.course;

import javax.swing.JFrame;

import com.varikoz272.ui.course.component.NiceButton;
import com.varikoz272.ui.course.component.NiceTextField;

public class App {
    public static void main(String[] args) {
        initJFrame();

    }

    public static void initJFrame() {
        JFrame f = new JFrame();
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        NiceButton b = new NiceButton("bh jvgbghjmnv , bhjmnv,");
        b.setBounds(50, 50, 150, 50);
        f.add(b);

        NiceButton b1 = new NiceButton("bh jvgbghjmnv , bhjmnv,");
        b1.setBounds(100, 150, 100, 100);
        f.add(b1);

        NiceTextField t = new NiceTextField();
        t.setBounds(200, 250, 150, 40);
        f.add(t);

        f.setVisible(true);
    }
}
