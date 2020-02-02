package chex8;

public class DrawLogger2 extends Deck implements Observer{
	
	public DrawLogger2() {
		super.addObservers(this);;
	}
	@Override
	public void hasDrawn(Deck pdeck) {
		System.out.println(pdeck.getDrawnCard());
		
	}

	@Override
	public void sizeChanged(Deck pdeck) {
		System.out.println(pdeck.getaCards().size());
		
	}

}
