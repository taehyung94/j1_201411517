package com.sd.adress.v1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookGUIMain {
  public static JTextField id = new JTextField(20);
  public static JTextField name=  new JTextField(20);
  public static JTextField number = new JTextField(20);
  public static void main(String[] args) {
    JFrame f = new JFrame();
    JPanel panel = new JPanel(new GridLayout(5,50));
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("ID");
    JLabel label2 = new JLabel("�̸�");
    JLabel label3 = new JLabel("��ȭ��ȣ");
    JButton b1 = new JButton("����");
    JButton b2 = new JButton("����");
    JButton b3 = new JButton("ã��");
    JButton b4 = new JButton("����");
    b1.addActionListener(new AddressListener());
    b2.addActionListener(new AddressListener());
    b3.addActionListener(new AddressListener());
    b4.addActionListener(new AddressListener());
    panel.add(label1);
    panel.add(id);
    panel.add(label2);
    panel.add(name);
    panel.add(label3);
    panel.add(number);
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(b4);
    f.pack();
    f.setVisible(true);
  }
}
