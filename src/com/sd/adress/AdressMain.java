package com.sd.adress;

import java.awt.*;
import javax.swing.*;

public class AdressMain{
  public static void main(String[] args){
    JFrame f=new JFrame();
    JPanel p=new JPanel(new GridLayout(2,2));
    f.getContentPane().add(p);
    JTextField blank1=new JTextField(20);
    JTextField blank2=new JTextField(20);
    JButton b1=new JButton("�˻�");
    JButton b2=new JButton("�߰�");
    JButton b3=new JButton("����");
    p.add(blank1);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    f.pack();
    f.setVisible(true);
  }
}