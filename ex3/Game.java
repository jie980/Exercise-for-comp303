import java.util.Comparator;

public class Game
{
   private static final Comparator<Card> NULL_COMPARATOR = new Comparator<Card>() {
      public int compare(Card pCard1, Card pCard2)
      {
         return 0;
      }};
	
   private Comparator<Card> aComparator = NULL_COMPARATOR;
}