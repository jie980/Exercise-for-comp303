package chex8;

public class DrawLogger implements Observer{
	private Deck adeck;
	public DrawLogger(Deck pdeck){
		adeck = pdeck;
		adeck.addObservers(this);
		
	}
	
	@Override
	public void hasDrawn(Deck pdeck) {
	
		System.out.println(pdeck.getDrawnCard());
		
	}
	//adpater
	@Override
	public void sizeChanged(Deck pdeck) {
		
		// TODO Auto-generated method stub
		
	}

}
