package headfirst.command.dvd;

public class DvdControl{
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  public DvdControl(){
    Command noCommand=new NoCommand();
    onCommands=new Command[7];
    offCommands=new Command[7];
    noCommand=new NoCommand();
    for(int i=0;i<7;i++){
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setOnCommand(int slot,Command c){
    onCommands[slot]=c;
  }
  public void setOffCommand(int slot,Command c){
    offCommands[slot]=c;
  }
  public void onButtonWasPushed(int slot){
    onCommands[slot].execute();
    undoCommand=onCommands[slot]; 
  }
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }
}
  