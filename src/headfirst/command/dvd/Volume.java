package headfirst.command.dvd;

public class Volume{
  int level;
  public void volumeUp(){
    level=100;
    System.out.println("volume up");
  }
  public void volumeDown(){
    level=0;
    System.out.println("volume down");
  }
  public void dim(int level){
    this.level=level;
  }
  public int getLevel(){
    return level;
  }
}