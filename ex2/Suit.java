package chex2;

public enum Suit {
	CLUBS, DIAMONDS, SPADES, HEARTS;
	
	
	enum Color{
		RED, BLACK	
		
	}
	
	public Color color() {
		if(this == CLUBS || this ==SPADES) {
			return Color.BLACK;
		}
		else {
			return Color.RED;
		}
	}

}