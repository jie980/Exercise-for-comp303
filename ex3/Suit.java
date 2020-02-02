public enum Suit 
{ 
	CLUBS, DIAMONDS, SPADES, HEARTS;
	
	public String toString() {
		if( this ==  CLUBS) {
			return "\u2663";
		}
		else if ( this == DIAMONDS){
			return "\u2666";
		}
		else if(this == HEARTS) {
			return "\u2665";
		}
		else
			return "\u2660";

	}
}