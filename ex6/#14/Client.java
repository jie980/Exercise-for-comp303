package chex6.ex14;
import chex6.*;
public class Client {
	public static void main(String[] args) {
	Program p = new Program();
	Command add1 = p.createaddCommand(new Movie("King",1998,120), Day.M);
	add1.execute();
	}
}
