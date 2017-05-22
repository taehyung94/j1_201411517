package headfirst.command.undo;

public class LightOffCommand implements Command{
  Light light;
  int level;
  public LightOffCommand(Light light){
    light=this.light;
  }
  public void execute(){
    level=light.getLevel();
    light.off();

  }
  public void undo(){
    light.dim(level);
  }
}
    