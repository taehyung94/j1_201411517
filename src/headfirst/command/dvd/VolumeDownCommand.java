package headfirst.command.dvd;

public class VolumeDownCommand implements Command{
  Volume volume;
  int level;
  public VolumeDownCommand(Volume volume){
    this.volume=volume;
  }
  public void execute(){
    this.level=volume.getLevel();
    volume.volumeDown();
  }
  public void undo(){
    volume.dim(level);
  }
}