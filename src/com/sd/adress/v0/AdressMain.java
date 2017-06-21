package com.sd.adress.v0;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class AdressMain{
  public static HashMap<String,String> adress=new HashMap<String,String>();
  public static JTextField blank1=new JTextField(20);
  public static void main(String[] args){
    JFrame f=new JFrame();
    JPanel p=new JPanel(new GridLayout(2,2));
    f.getContentPane().add(p);
    JTextField blank2=new JTextField(20);
    JButton b1=new JButton("°Ë»ö");
    JButton b2=new JButton("Ãß°¡");
    JButton b3=new JButton("Á¤·Ä");
    b2.addActionListener(new Function());
    p.add(blank1);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    f.pack();
    f.setVisible(true);
  }
}
