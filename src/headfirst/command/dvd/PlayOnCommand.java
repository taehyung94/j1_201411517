package headfirst.command.dvd;

public class PlayOnCommand implements Command{
  Play play;
  boolean p;
  PlayOnCommand(Play play){
    this.play=play;
  }
  public void execute(){
    p=play.getP();
    play.play();
  }
  public void undo(){
    play.dim(p);
  }
}
    