package headfirst.singleton.threadsafe;

public class ChocolateMain{
  public static void main(String[] args){
    ChocolateBoiler cb=ChocolateBoiler.getInstance();
    cb.fill();
    cb.boil();
    cb.drain();
    ChocolateBoiler cb1=ChocolateBoiler.getInstance();
    cb1.fill();
  }
}