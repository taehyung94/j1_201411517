package headfirst.command.dvd;

public class VolumeUpCommand implements Command{
  Volume volume;
  int level;
  public VolumeUpCommand(Volume volume){
    this.volume=volume;
  }
  public void execute(){
    this.level=volume.getLevel();
    volume.volumeUp();
  }
  public void undo(){
    volume.dim(level);
  }
}