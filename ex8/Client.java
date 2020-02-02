package chex8;

public class Client {
	public static void main(String[] args) {
	Deck deck1 = new Deck();
	new DrawLogger(deck1);
	new SizeStatus(deck1);
	Card c =deck1.draw();
	System.out.println("------");
	deck1.draw();
	System.out.println("------");
	deck1.push(c);
	System.out.println("------");
	deck1.draw();
	System.out.println("------");
	deck1.draw();
	System.out.println("------");
	
	System.out.println("第二题");
	DrawLogger2 deck2 = new DrawLogger2();
	
	Card c1=deck2.draw();
	deck2.draw();
	deck2.push(c1);
	}
}
