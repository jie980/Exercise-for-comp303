package chex9;

import java.util.Map;

public class Movie 

{
	private String aTitle;
	private int aTime;
	private int aYear;
	
	private static Map<String,Movie> flyweight;

	public static Movie getter(String pName,int pYear, int pTime) {
		Movie m = flyweight.computeIfAbsent(pName, (String name)-> new Movie(pName,pYear,pTime) );
		return  m;
//		if(!flyweight.containsKey(pName)) {
//			flyweight.put(pName, new Movie(pName,pYear,pTime));
//		}
//		return flyweight.get(pName);
	}
	
	
	
	public Movie(String pTitle, int pYear, int pTime)
	{	aTitle = pTitle;
		aTime =pTime;

		aYear = pYear;
	}




	
	public String description()
	{
		return String.format("%s (%d)", aTitle, aYear);
	}	

	public int year() {
		return aYear;
	}
	
	public boolean isOld() {
		return aYear<1960;
	}
	
	public int time() {
		return aTime;
	}
	public String title() {
		return aTitle;
	}
}

