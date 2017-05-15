package headfirst.singleton.threadsafe;

public class ChocolateBoiler{
  private static ChocolateBoiler uniqueInstance;
  private boolean empty;
  private boolean boiled;
  private static int numCalled=0;
  private ChocolateBoiler(){
    empty=true;
    boiled=false;
  }
  public static synchronized ChocolateBoiler getInstance(){
    if(uniqueInstance==null){
      System.out.println("Creating..");
      uniqueInstance=new ChocolateBoiler();
    }
    System.out.println("returning..");
    System.out.println("num called.. "+numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
      empty=false;
      boiled=false;
      System.out.println("filling..");
    }
  }
  public void boil(){
    if(!isEmpty()&&!isBoiled()){
      boiled=true;
      System.out.println("boiling..");
    }
  }
  public void drain(){
    if(!isEmpty()&&isBoiled()){
      empty=true;
      System.out.println("draining..");
    }
  }
  public boolean isEmpty(){
    return empty;
  }
  public boolean isBoiled(){
    return boiled;
  }
}   
  