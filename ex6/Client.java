package chex6;

import java.util.Iterator;
import java.util.List;

public class Client {
	private static final Concert c1 = new Concert("nihao","jie",2);
	private static final Movie movie1  = new Movie("king",1999,3);
	private static final Movie movie2 =new Movie("Queen",1998,4);

	public static void main(String[] args) {

		CompositeShow movies = new CompositeShow(movie1,movie2);
		CompositeShow shows = new CompositeShow(c1,movies);
	
		System.out.println(shows.description());
		
		IntroducedShow intromovie2 = new IntroducedShow(movie2,10,"speaker1");
		CompositeShow movies2 = new CompositeShow(movie1,intromovie2);
		CompositeShow shows2 = new CompositeShow(c1,movies2);
		IntroducedShow introshows2 = new IntroducedShow(shows2,20,"speaker2");
		System.out.println(introshows2.description());
		
		

	}

		


}
