package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore nystore=new NYPizzaStore();
    PizzaStore chistore=new ChicagoPizzaStore();
    Pizza pizza=nystore.orderPizza("cheese");
    System.out.println("Taehyung order "+pizza+"\n");
    pizza=chistore.orderPizza("cheese");
    System.out.println("taehyung order "+pizza+"\n");
  }
}