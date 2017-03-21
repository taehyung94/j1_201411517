package headfirst.strategy;

public class FlyDuck{
  public static void main(String[] args){
    Duck mallard=new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    mallard.display();
    mallard.swim();
    
    Duck model=new ModelDuck();
    model.performQuack();
    model.performFly();
    model.display();
    model.swim();
  }
}