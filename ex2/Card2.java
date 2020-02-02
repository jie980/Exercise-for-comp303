package chex2;

public class Card2 {
	private Rank aRank;
	private Suit aSuit;
	private boolean suit1 = false;
	private boolean suit2 = false;
	private boolean rank1 = false;
	private boolean rank2 = false;
	private boolean rank3 = false;
	private boolean rank4 = false;
	
	
	private void fromRank(Rank pRank)
	{
		int value = pRank.ordinal();
		rank1 = value % 2 == 1;
		value /= 2;
		rank2 = value % 2 == 1;
		value /= 2;
		rank3 = value % 2 == 1;
		value /= 2;
		rank4 = value % 2 == 1;
		value /= 2;
	}
	public Rank getRank()
	{
		int value = 0;
		if( rank4 == true )
		{
			value += 8;
		}
		if( rank3 == true )
		{
			value += 4;
		}
		if( rank2 == true )
		{
			value += 2;
		}
		if( rank1 == true )
		{
			value += 1;
		}
		return Rank.values()[value];
	}
	private void fromSuit(Suit pSuit)
	{	
		suit1=false;
		suit2=false;
		if(pSuit==aSuit.CLUBS) {

		}
		else if(pSuit==aSuit.DIAMONDS) {
			suit2 = true;
		}
		else if(pSuit==aSuit.HEARTS) {
			suit1 = true;
		}
		else if(pSuit==aSuit.SPADES) {
			suit1 = true;
			suit2 = true;
		}
		
	}
	
	public Suit getSuit() {
		if (suit1==suit2) {
			if(suit1 ==false) {
				return Suit.CLUBS;
			}
			else return Suit.SPADES;
		}
		
		else {
			if(suit1==true) {
				return Suit.HEARTS;
			}
			else return Suit.DIAMONDS;
		}
		
	}
	@Override
	public String toString()
	{
		return String.format("%s of %s", getRank(), getSuit());
	}
}
