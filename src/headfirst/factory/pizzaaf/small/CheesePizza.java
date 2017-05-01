package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory infact;
  public CheesePizza(PizzaIngredientFactory ingredientFactory) { 
    this.infact=ingredientFactory;
  }
 public void prepare(){
   dough=infact.createDough();
   cheese=infact.createCheese();
 }
}