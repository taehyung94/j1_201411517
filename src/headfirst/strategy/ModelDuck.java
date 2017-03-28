package headfirst.strategy;

public class ModelDuck extends Duck{
  public ModelDuck(){
    flyBehavior=new FlyWithRocket();
    quackBehavior=new Quack();
  }
  public void display(){
    System.out.println("I'm a model duck!");
  }
}