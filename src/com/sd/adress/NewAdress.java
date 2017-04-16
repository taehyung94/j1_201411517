package com.sd.adress;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.GridLayout;

public class NewAdress extends JDialog implements ActionListener{
  JTextField t1=new JTextField(20);
  JTextField t2=new JTextField(20);
  JButton b1=new JButton("입력");
  JButton b2=new JButton("취소");
  ArrayList<String> adr=new ArrayList<String>();
  public NewAdress(){
    this.setLayout(new GridLayout(2,2));
    this.add(t1);
    this.add(t2);
    this.add(b1);
    this.add(b2);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
      adr.add(t1.getText());
      adr.add(t1.getText());
    }
  }
}