import java.util.Comparator;

public class test {
	

	//NULLcomparator
	private Comparator<Card> aComparator = new Comparator<Card>() {
		public int compare(Card pCard1, Card pCard2)
		{
			return 0;
		}
	};;
	
	
	
	public static void main(String[] args) {
		//Deck a = new Deck();
		//for(Card c:a) {
			//System.out.println(c.toString());
			
		//}
		GameModel d =GameModel.instance();
		GameModel e = GameModel.instance();//d e是同一个instance因为我们创建了singlinton来储存
		System.out.println(d.equals(e));
		d.newGame();
		System.out.println(Math.ulp(0.0));

		
		
	}
}
