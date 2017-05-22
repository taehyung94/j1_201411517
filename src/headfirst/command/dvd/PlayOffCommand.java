package headfirst.command.dvd;

public class PlayOffCommand implements Command{
  Play play;
  boolean p;
  PlayOffCommand(Play play){
    this.play=play;
  }
  public void execute(){
    p=play.getP();
    play.stop();
  }
  public void undo(){
    play.dim(p);
  }
}
    