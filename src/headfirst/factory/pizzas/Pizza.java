package headfirst.factory.pizzas;

import java.util.ArrayList;

abstract public class Pizza {
 String name;
 String d;
 String sauce;
 ArrayList toppings = new ArrayList();
 public void prepare() {
  System.out.println("Preparing " + name);
 }
 public void bake() {
  System.out.println("Baking " + name);
 }
 public void cut() {
  System.out.println("Cutting " + name);
 }
 public void box() {
  System.out.println("Boxing " + name);
 }
}