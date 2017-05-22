package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu{
  //MenuItem[] menuitems;
  ArrayList<MenuItem> menuitems;
  
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  public PancakeHouseMenu(){
    //menuitems=new MenuItem[MAX_ITEMS];
    menuitems=new ArrayList<MenuItem>();
    addItem("BLT","Bacon, Lettuce, Tomato",true,2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  public void addItem(String n,String d,boolean v,double p){
    MenuItem menuitem=new MenuItem(n,d,v,p);
    menuitems.add(menuitem);
    //numberOfItems++;
  }
  public ArrayList<MenuItem> getMenuItems(){
    return menuitems;
  }
}