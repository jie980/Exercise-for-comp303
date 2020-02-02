package chex8.ex12;

public class Client {
	public static void main(String[] args) {
	
	Directory bestgame = new Directory("bestgame",new SymbolicLink("link2",new File("clash royal")));
	Directory game = new Directory("game",new File("zumble"),new File("lol"),new SymbolicLink("link1",new File("4399")),bestgame);
	Directory root = new Directory("root",game,new File("movie"));

	root.accept(new PrintVisitor());
	}
	
}
