package com.sd.gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcAreaListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    if(cmd.equals("���")){
      System.out.println("����ư");
      b.setText("����߽��ϴ�.");
    }
  }
}