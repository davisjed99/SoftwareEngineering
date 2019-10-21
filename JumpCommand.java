package csce247.assignments.command;

public class JumpCommand implements Command {
	private Player player;
	
	public JumpCommand(Player player) {
		this.player = player;
	}
	
	public void execute() {
		player.jump();
	}
	
	public String getName() {
		return "Our hero jumps over a tall building";
	}
}
