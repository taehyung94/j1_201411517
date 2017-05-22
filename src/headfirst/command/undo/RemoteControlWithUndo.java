package headfirst.command.undo;

public class RemoteControlWithUndo{
  Command[] onCommands;
  Command[] offComands;
  Command undoCommand;
  public RemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommand=new Command[7];
    //Null object;
    Command noCommand=new NoCommand();
    for(int i=0;i<7;i++){
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setOnCommand(int slot,Command c){
    //slot=c;
    onCommands[slot]=c;
  }
  public void setOffCommand(int slot,Command c){
    //slot=c;
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