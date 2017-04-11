package headfirst.decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator{
  Beverage b;
  public SteamedMilk(Beverage b){
    this.b=b;
  }
  public String getDescription(){
    return b.getDescription()+ ", Milk";
  }
  public double cost(){
    return 1.0+b.cost();
  }
}