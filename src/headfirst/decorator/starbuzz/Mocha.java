package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage b;
  public Mocha(Beverage b){
    this.b=b;
  }
  public String getDescription(){
    return b.getDescription()+", adding Mocha";
  }
  public double cost(){
    return b.cost();
  }
}