package com.sd.adress;

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
    JButton b1=new JButton("검색");
    JButton b2=new JButton("추가");
    JButton b3=new JButton("정렬");
    b2.addActionListener(new Function());
    p.add(blank1);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    f.pack();
    f.setVisible(true);
  }
}

class NewAdress extends JDialog implements ActionListener{
  JTextField t1=new JTextField(20);
  JTextField t2=new JTextField(20);
  JButton b1=new JButton("입력");
  JButton b2=new JButton("취소");
  public NewAdress(){
    this.setSize(400,200);
    this.setLayout(new GridLayout(2,2));
    this.add(t1);
    this.add(t2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    this.add(b1);
    this.add(b2);
    this.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
      AdressMain.adress.put(t1.getText(),t2.getText());
    }
  }
}

class Function implements ActionListener{
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    if(cmd.equals("추가")){
      new NewAdress();
    }
    else if(cmd.equals("검색")){
      String name=AdressMain.blank1.getText();
      if(AdressMain.adress.containsKey(name))
        System.out.println(AdressMain.adress.get(name));
    }
  }
}
