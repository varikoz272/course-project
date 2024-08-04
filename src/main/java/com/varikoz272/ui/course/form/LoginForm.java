package com.varikoz272.ui.course.form;

import javax.swing.JFrame;

public class LoginForm extends CourseForm {

    public LoginForm() {
        super();
        initWindow();
        initComponents();
    }

    private void initWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setName(getName());
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {

    }

    @Override
    public String getName() {
        return "Логин";
    }
}
