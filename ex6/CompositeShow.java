package chex6; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CompositeShow implements Show {
	private List<Show> showslist= new ArrayList<>() ;
	public CompositeShow(Show...shows ) {
	
		showslist = Arrays.asList(shows);
	}
	public CompositeShow(List<Show> shows) {
		showslist = shows;
	}
	@Override
	public String description() {
		StringBuilder build = new StringBuilder();
		for(Show s:showslist)
			build.append(s.description());
		return  build.toString();
	}

	@Override
	public int runningTime() {
		int sum =0;
		for(Show s:showslist) {
			sum = sum+s.runningTime();
		}
		return sum;
	}

	@Override
	public Show copy() {
		List<Show> shows = new ArrayList<>();
		for(Show s:showslist) {
			shows.add(s);
		}
	
	
		
		
		return new CompositeShow(shows);

	}
	@Override
	public Iterator<Show> iterator() {
		
		return showslist.iterator();
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(showslist);
	}
	@Override
	public boolean equals(Object obj)
	{
	   if (this == obj)
	      return true;
	   if (obj == null)
	      return false;
	   if (getClass() != obj.getClass())
	      return false;
	   CompositeShow other = (CompositeShow) obj;
	   return Objects.equals(showslist, other.showslist);
	}
}
