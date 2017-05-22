package headfirst.iterator.dinermerger.before;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
 
    printMenu();
    }
    public static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
          if(breakfastItems.get(i)==null)
            continue;
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
          if(lunchItems[i]==null)
            continue;
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
} 