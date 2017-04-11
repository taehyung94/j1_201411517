package headfirst.decorator.starbuzz;

public class Caramel extends CondimentDecorator{
  Beverage b;
  public Caramel(Beverage b){
    this.b=b;
  }
  public String getDescription(){
    return b.getDescription()+" adding Caramel";
  }
  public double cost(){
    return 1.0 + b.cost();
  }
}