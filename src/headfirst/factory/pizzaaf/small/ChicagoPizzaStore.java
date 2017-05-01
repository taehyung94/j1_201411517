package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore{
  protected Pizza createPizza(String item){
    Pizza pizza=null;
    PizzaIngredientFactory infac=new ChicagoPizzaIngredientFactory();
    if(item.equals("cheese")){
      pizza=new CheesePizza(infac);
      pizza.setName("Chicago Style Cheese Pizza");
    }
    return pizza;
  }
}