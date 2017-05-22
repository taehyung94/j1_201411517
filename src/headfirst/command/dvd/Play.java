package headfirst.command.dvd;

public class Play{
  public boolean p;
  public void play(){
    p=true;
    System.out.println("playing");
  }
  public void stop(){
    p=false;
    System.out.println("stop");
  }
  public void dim(boolean p){
    this.p=p;
  }
  public boolean getP(){
    return p;
  }
} 