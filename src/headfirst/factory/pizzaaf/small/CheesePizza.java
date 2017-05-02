package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza {
  PizzaIngredientFactory infact;
  public CheesePizza(PizzaIngredientFactory ingredientFactory) { 
    this.infact=ingredientFactory;
    name="Abstract Factory Cheese Pizza";
  }
 public void prepare(){
   System.out.println("preparing...");
   dough=infact.createDough();
   cheese=infact.createCheese();
   potato=infact.createPotato();
 }
}