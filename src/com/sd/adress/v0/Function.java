class Function implements ActionListener{
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    if(cmd.equals("�߰�")){
      new NewAdress();
    }
    else if(cmd.equals("�˻�")){
      String name=AdressMain.blank1.getText();
      if(AdressMain.adress.containsKey(name))
        System.out.println(AdressMain.adress.get(name));
    }
  }
}
