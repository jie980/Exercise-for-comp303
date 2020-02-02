package chex6.ex14;

import java.util.EnumMap;

import chex6.Show;

/**
 * Class responsible for managing a program that consists
 * of various shows presented on different days of one week.
 * Each day of the week must be associated with exactly one
 * Show object. If there is not show on a given day, a special 
 * object of type show is used to represent a "non-show".
 */
public class Program
{	
	
	private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);
	private Show nullShow = createNullShow();

	public Command createaddCommand(Show pshow, Day pDay) {
		return new Command() {
			public void execute() {
				add(pshow,pDay);
				System.out.println("add success");
			}
			public void undo() {
				remove(pDay);
			}
		};
	}
	public  Command createremoveCommand(Day pday) {
		Show removedShow = aShows.get(pday);
		return new Command() {
			
			public void execute() {
				remove(pday);
			}
			public void undo() {
				add(removedShow,pday);
			}
		};
	}
	public Command createclearCommand() {
		return new Command() {
			public void execute() {
				clear();
			}
			public void undo() {
				
			}
		};
	}
   private static Show createNullShow() {
	      return new Show() {
	         @Override public String description() { return ""; }
	         @Override public int runningTime() { return 0; }
	         @Override public Show copy() { return createNullShow(); }
	         @Override public int hashCode() { return 0; }
	         @Override public boolean equals(Object pObject) 
	         { return pObject != null && pObject.getClass() == this.getClass(); }
	      };
	   }
   
	public Program() { 
		// TODO
		clear();
	}
	
	/**
	 * Clear the program by removing all existing shows.
	 */
	public void clear()
	{
		// TODO
		   for( Day day : Day.values() )
		   {	
			  
		      aShows.put(day, nullShow);
		   }
	}
	
	/**
	 * Adds a new show to the program. Overrides any existing show
	 * on that day.
	 * @param pShow The show to add.
	 * @param pDay The day when the show takes place.
	 */
	public void add(Show pShow, Day pDay)
	{
		   assert pShow != null && pDay != null;
		   aShows.put(pDay, pShow);
	}
	
	
	/**
	 * Removes a show from the program.
	 * @param pDay The day when we want to zap the show.
	 */
	public void remove(Day pDay)
	{
		   assert pDay != null;
		
		   
		
	}
	
	/**
	 * @param pDay The day of the requested show.
	 * @return A copy of the show on a given day.
	 */
	public Show get(Day pDay)
	{
		   assert pDay != null && aShows.containsKey(pDay);
		   return aShows.get(pDay);
	}
	
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		for( Day day : aShows.keySet() )
		{
			if( aShows.containsKey(day))
			{
				result.append(String.format("%9s", day.name()))
					.append(": ").append(aShows.get(day).description()).append("\n");
			}
		}
		return result.toString();
	}
}