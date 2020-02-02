import java.util.Comparator;

import java.util.Optional;



public class Card implements Comparable<Card>
{
	private Optional<Rank> aRank;
	private Optional<Suit> aSuit;
	private Optional<Colour> aColour;
	
	private boolean joker =false;
	// Flyweight store
	private static final Card[][] CARDS = new Card[Suit.values().length][Rank.values().length];
	
	static
	{
		for( Suit suit : Suit.values() )
		{
			for( Rank rank : Rank.values() )
			{
				CARDS[suit.ordinal()][rank.ordinal()] = new Card(rank, suit);
			}
		}
	}
	/**
	 * Creates a new card object.
	 * 
	 * @param pRank The rank of the card.
	 * @param pSuit The suit of the card.
	 * @pre pRank != null
	 * @pre pSuit != null
	 */
	private Card(Rank pRank, Suit pSuit)
	{

			//assert pRank != null && pSuit !=null;
			aRank = Optional.of(pRank);
			aSuit = Optional.of(pSuit);
			aColour = Optional.empty();
			joker = false;
		


	}
	private Card(Colour pColour) {
		aRank = Optional.empty();
		aSuit = Optional.empty();
		aColour = Optional.of(pColour);
		joker = true;
	}
	public static Card get(Rank pRank, Suit pSuit)
	{
		assert pRank != null && pSuit != null;
		//lazy create
		if (CARDS[pSuit.ordinal()][pRank.ordinal()] ==null) {
			 CARDS[pSuit.ordinal()][pRank.ordinal()]= new Card(pRank,pSuit);
		}
		return CARDS[pSuit.ordinal()][pRank.ordinal()];
	}
	
	public boolean isJoker() {
		
		return joker;
	}
	/**
	 * @return The rank of the card.
	 */
	public Rank getRank()
	{
		return aRank.get();
	}
	
	/**
	 * @return The suit of the card.
	 */
	public Suit getSuit()
	{
		return aSuit.get();
	}

	@Override
	public int compareTo(Card pCard)
	{	
		if (this.isJoker() && pCard.isJoker()) {
			return this.aColour.get().compareTo(pCard.aColour.get());
		}
		if (this.isJoker() && !pCard.isJoker()) {
			return 1;
		}
		if (!this.isJoker() && pCard.isJoker()) {
			return -1;
		}
		else
		return aRank.get().compareTo(pCard.aRank.get());
		
	}
	
	/**
	 * Sample static factory method to create a comparator capable
	 * of comparing cards by rank.
	 * 
	 * @return The created comparator.
	 */
	public static Comparator<Card> createByRankComparator()
	{
		return new Comparator<Card>()
		{
			public int compare(Card pCard1, Card pCard2)
			{ 
				return pCard1.aRank.get().compareTo(pCard2.aRank.get());
			}
		};
	}
	
	/*public static Comparator<Card> createBySuitComparator()
	{
		return new Comparator<Card>()
		{
			public int compare(Card pCard1, Card pCard2)
			{ 
				return pCard1.aSuit.compareTo(pCard2.aSuit);
			}
		};
	}*/
	public String toString() {
		if(!this.isJoker()) {
			return this.aRank.get().toString()+ this.aSuit.get().toString();}
		else {
			return this.aColour.toString();
		}
			
	}
	
	public boolean equal(Object c1) {
		Card c= (Card) c1;
		if(c.aRank == this.aRank && this.aSuit == c.aSuit &&this.aColour == c.aColour) {
			return true;
		}
		return false;
	}

}