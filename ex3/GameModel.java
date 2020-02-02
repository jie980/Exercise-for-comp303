
public class GameModel {
	private static final GameModel Instance =new GameModel();
	private final Deck aDeck = new Deck();
	private GameModel() {
		
	}
	public static GameModel instance(){return Instance;}
	public void newGame()
	{
		aDeck.shuffle();
	}
	
}
