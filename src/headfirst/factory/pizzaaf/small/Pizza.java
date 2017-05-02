package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;

public abstract class Pizza {
 String name;
 Dough dough;
 String sauce;
 Cheese cheese;
 Potato potato;
 ArrayList<String> toppings = new ArrayList<String>();
 protected abstract void prepare();
 protected void bake() {
  System.out.println("Bake for 25 minutes at 350");
 }
 protected void cut() {
  System.out.println("Cutting the pizza into diagonal slices");
 }
 protected void box() {
  System.out.println("Place pizza in official PizzaStore box");
 }
 void setName(String name){
   this.name=name;
 }
 public String getName() {
  return name;
 }
 public String toString() {
  StringBuffer display = new StringBuffer();
  display.append("---- " + name + " ----\n");
  display.append(dough + "\n");
  display.append(cheese+"\n");
  display.append(potato+"\n");
  //display.append(sauce + "\n");
  /*for (int i = 0; i < toppings.size(); i++) {
   display.append((String )toppings.get(i) + "\n");
  }*/
  return display.toString();
 }
}