package chex6.ex14;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {
	private final List<Command> aCommands = new ArrayList<>();
	public void comsume(Command pcommand) {
		pcommand.execute();
		aCommands.add(pcommand);
	}
	public void undolast() {
		assert !aCommands.isEmpty();
		Command c =aCommands.remove(aCommands.size()-1);
		c.undo();
	}
}
