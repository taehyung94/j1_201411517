package headfirst.command.dvd;

public class DvD{
  boolean p;
  public void play(){
    System.out.println("playing");
    p=true;
  }
  public void stop(){
    System.out.println("stop");
    p=false;
  }
}