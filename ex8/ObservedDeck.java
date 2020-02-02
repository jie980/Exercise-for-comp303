package chex8;

import java.util.ArrayList;

public class ObservedDeck extends Deck {
	private ArrayList<Observer> aObservers = new ArrayList<Observer>();
	
	@Override
	public void shuffle() {
		super.shuffle();
		for(Observer o:aObservers) {
			o.sizeChanged(this);
		}
	}
	@Override
	public void push(Card pCard) {
		super.push(pCard);
		for(Observer o:aObservers) {
			o.sizeChanged(this);
		}
	}
	@Override
	public Card draw() {
		
		Card c=  super.draw();
		for(Observer o:aObservers) {
			o.hasDrawn(this);
		}
		return c;
		
	}
	
	public void addObserver(Observer o) {
		assert o != null;
		aObservers.add(o);
	}
}
