package com.sd.adress.v0;
class NewAdress extends JDialog implements ActionListener{
  JTextField t1=new JTextField(20);
  JTextField t2=new JTextField(20);
  JButton b1=new JButton("ÀÔ·Â");
  JButton b2=new JButton("Ãë¼Ò");
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
