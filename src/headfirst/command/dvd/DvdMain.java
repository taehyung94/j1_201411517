package headfirst.command.dvd;

public class DvdMain{
  public static void main(String[] args){
    Play play=new Play();
    Volume volume=new Volume();
    PlayOnCommand playon=new PlayOnCommand(play);
    PlayOffCommand playoff=new PlayOffCommand(play);
    VolumeUpCommand volumeup=new VolumeUpCommand(volume);
    VolumeDownCommand volumedown=new VolumeDownCommand(volume);
    DvdControl newDvd=new DvdControl();
    newDvd.setOnCommand(0,playon);
    newDvd.setOnCommand(1,volumeup);
    newDvd.setOffCommand(0,playoff);
    newDvd.setOffCommand(1,volumedown);
    newDvd.onButtonWasPushed(0);
    newDvd.onButtonWasPushed(1);
    newDvd.offButtonWasPushed(0);
    newDvd.offButtonWasPushed(1);
    newDvd.undoButtonWasPushed();
  }
}