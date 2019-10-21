package csce247.assignments.command;

import java.util.HashMap;

public class InputHandler {
	
	private HashMap<String, String> commands = new HashMap<String, String>();

	public InputHandler(Player player) {
		commands.put("jump", "player.jump()");
		commands.put("run", "player.runForward()");
		commands.put("fire", "player.fire()");
		commands.put("quit", "player.quit()");
	}
	
	public void buttonPressed(String button) {
		commands.get(button);
	}
}
