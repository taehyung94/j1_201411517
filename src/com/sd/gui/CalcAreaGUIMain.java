package com.sd.gui;

import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain{
  public static void main(String[] args){
    JFrame f=new JFrame();
    JPanel p=new JPanel(new GridLayout(3,2));
    f.getContentPane().add(p);
    JLabel label1=new JLabel("������");
    JLabel label2=new JLabel("����");
    JTextField radiusTf1=new JTextField(20);
    JTextField areaTf2=new JTextField(20);
    JButton b1=new JButton("���");
    JButton b2=new JButton("���");
    b1.addActionListener(new CalcAreaListener());
    b2.addActionListener(new CalcAreaListener());
    p.add(label1);
    p.add(radiusTf1);
    p.add(label2);
    p.add(areaTf2);
    p.add(b1);
    p.add(b2);
    f.pack();
    f.setVisible(true);
  }
}