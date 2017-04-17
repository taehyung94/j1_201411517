package com.sd.adress;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Function implements ActionListener{
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    if(cmd.equals("추가")){
      new NewAdress();
    }
    else if(cmd.equals("검색")){
      if 
  }
}