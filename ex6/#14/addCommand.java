package chex6.ex14;

import chex6.Show;

public class addCommand implements Command {
	
	private Program aProgram;
	private Show aShows;
	private Day aDay;
	
	public addCommand(Program pprogram, Day pday,Show pShows) {
		aProgram = pprogram;
		aDay = pday;
		aShows = pShows;
		
		
	}
	@Override
	public void execute() {
		aProgram.add(aShows,aDay);
		
	}
	@Override
	public void undo() {
		aProgram.remove(aDay);
	}

}
