package chex8;

public class SizeStatus implements Observer {
	private Deck adeck;
	public SizeStatus(Deck pdeck){
		adeck = pdeck;
		adeck.addObservers(this);
		
	}
	//adapter
	@Override
	public void hasDrawn(Deck pdeck) {
		System.out.println(pdeck.getaCards().size());
		
	}
	@Override
	public void sizeChanged(Deck pdeck) {
		System.out.println(pdeck.getaCards().size());
		
	}

}
