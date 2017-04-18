package headfirst.factory.pizzafm;

public abstract class PizzaStore{
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String item){
  Pizza pizza;
  pizza =createPizza(item); 
  pizza.prepare();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;
  }
}