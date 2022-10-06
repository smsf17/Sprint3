package Nivel3;

public class Driver {
	
	Command command;
	
	public Driver(Command command) {
		this.command = command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void takeAction() {
		command.execute();
	}
	
	public void revertAction() {
		command.revert();
	}

}
