package com.sd.adress.v1;
  
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class AddressListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    AddressMain a = new AddressMain();
    if (cmd.equals("저장")) {
      person.setName(a.name.getText());
      person.setAddress(a.id.getText());
      personDAOImpl.insert(person);
    } else if (cmd.equals("제거")) {
      int x=Integer.parseInt(a.number.getText());
      personDAOImpl.delete(x);
    } else if (cmd.equals("찾기")) {
      if(a.number.getText()==null) {
        List<PersonVO> persons=personDAOImpl.findAll();
        Iterator iter=persons.iterator();
        while(iter.hasNext()) {
            person=(PersonVO)iter.next();
            System.out.println(person.toString());
        }
      } else if(a.number.getText()!=null) {
        int x=Integer.parseInt(a.number.getText());
        personDAOImpl.findById(x);
      }
    } else if (cmd.equals("수정")) {
        int x=Integer.parseInt(a.number.getText());
        person.setName(a.name.getText());
        person.setAddress(a.id.getText());
        person.setId(x);
        personDAOImpl.update(person);
    }
  }
}