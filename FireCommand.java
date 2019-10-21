package csce247.assignments.command;

public class FireCommand implements Command {
	private Player player;
	
	public FireCommand(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.fire();
	}
	
	public String getName() {
		return "Our hero squirts his water gun, far into the sky";
	}
}
