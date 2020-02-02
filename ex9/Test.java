package chex9;

import java.util.ArrayList;

import static java.util.stream.Collectors.toList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.Arrays.stream ;
import static java.util.function.Predicate.isEqual ;

public class Test {
	public static void main(String[] args) {
		ArrayList<Movie> ms =beforeonenine();
		for(Movie m :ms) {
			System.out.println(m.description());
		}
		//--------------------------------------------------
		System.out.println("----------------------------------");
		printall();
		//--------------------------------------------------
		ArrayList<Movie> ms2=sortlist2();
		System.out.println("----------------------------------");
		for(Movie m:ms2) {
			System.out.println(m.description());
		}
		//--------------------------------------------------
		
		System.out.println("----------------------------------");
		ms2.stream().map(m->m.time()).map(Test::HHmm).forEach(System.out::println);
	
		System.out.println("----------------------------------");
		ms2.stream()
		.filter(m->m.year()<2000)
		.sorted((m1,m2)->m2.time()-m1.time())
		.limit(3)
		.sorted((m1,m2)->m2.title().compareTo(m1.title()))
		.collect(toList())
		.forEach(m->System.out.println(m.description()));;
		
		System.out.println("----------------------------------");	
		Random random = new Random();
		System.out.println(IntStream.generate(()->random.nextInt(101)).limit(1000000).summaryStatistics());
		
		System.out.println("----------------------------------");
		System.out.println(ms2.stream()
		.map(m->m.title())
		.map(m->m.toLowerCase())
		.flatMap(String->stream(String.split("[\\s,]+")))
		.filter(Predicate.isEqual("the"))
		.count());
		
		System.out.println("----------------------------------");	
		System.out.println(ms2.stream().reduce((m1,m2)-> m1.time()>m2.time() ? m1:m2).get().description());
	
		System.out.println(ms2.stream().collect(Collectors.toMap(m->m.title(),m->m)));
		System.out.println("----------------------------------");	
		Map<String,List<Movie>> map =ms2.stream().collect(Collectors.groupingBy(m->String.format("%02ds", (m.year()%1900)/10*10)));
		System.out.println(map);
		map.entrySet().stream()
				.filter(key->key.getKey().equals("50s")||key.getKey().equals("60s"))
				.flatMap(key->key.getValue().stream()).forEach(key->System.out.println(key.description()));
	

	}
	public static String HHmm(int ptime) {
		return String.format("%d:%02d", ptime/60,ptime%60);
	}
	public static ArrayList<Movie> beforeonenine(){
		ArrayList<Movie> mos = new ArrayList<>(Movies.movies());
		mos.removeIf(Movie::isOld);
		mos.removeIf((Movie m) -> m.year()<1960);
		mos.removeIf(new Predicate<Movie>() {
	
			@Override
			public boolean test(Movie m) {
				
				return m.year()<1960;
			}

		});
		return mos;
		
	}
	
	public static void printall() {
		Iterable<Movie> mos = Movies.movies();
	
		mos.forEach(Test::print);
		
//		mos.forEach((Movie m) -> System.out.println(m.description()));
//		mos.forEach(new Consumer<Movie>() {
//			@Override
//			public void accept(Movie m) {
//				System.out.println(m.description());
//			}
//		});
	}
	private static void print(Movie m) {
		System.out.println(m.description());
	}
	
	public static  void sortlist() {
		ArrayList<Movie> mos = new ArrayList<>(Movies.movies());
		
		mos.sort(createByTimeComparator());
		mos.sort(Test::compareByTime);
	}
	private static Comparator<Movie> createByTimeComparator(){
		
		return (m1,m2)-> m1.time()-m2.time();
	}
	
	private static int compareByTime(Movie m1, Movie m2) {
		return m1.time()-m2.time();
	}

	
	public static ArrayList<Movie> sortlist2() {
		ArrayList<Movie> mos = new ArrayList<>(Movies.movies());
		 mos.sort(Comparator.comparing((Movie m)->m.time()).thenComparing((Movie m)->m.title()));
		return mos;
	}
}
