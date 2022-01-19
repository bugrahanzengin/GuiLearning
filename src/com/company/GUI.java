package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  implements ActionListener {

    int count = 0;
    //private JLabel label;
    private JFrame frame;
    private JPanel panel;
    //private String msg ="tcpdump is starting from";

    public GUI() {
        frame = new JFrame();

        JButton button1 = new JButton("AMF");
        button1.addActionListener(this);


        JButton button2 = new JButton("SMF");
        button2.addActionListener(this);


        JButton button3 = new JButton("PCF");
        button2.addActionListener(this);


        JButton button4 = new JButton("UPF");
        button2.addActionListener(this);


        JButton button5 = new JButton("UDM");
        button2.addActionListener(this);


        JButton button6 = new JButton("UDR");
        button2.addActionListener(this);


        JButton button7 = new JButton("Start");
        button2.addActionListener(this);


        JButton button8 = new JButton("Stop 111");
        button2.addActionListener(this);


        JButton button9 = new JButton("Timer");
        button2.addActionListener(this);


        //label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(0, 1));
        panel = new JPanel(new GridLayout(2,2,10,10));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        //panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        //label.setText("Number of clicks: " + count);
    }
}
