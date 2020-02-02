package chex8;

import java.util.ArrayList;
import java.util.List;

public class ObservableDeck extends Deck{
	private final List<Observer> aObservers = new ArrayList<>();
	
	public void addObserver(Observer pObserver)
	{
		assert pObserver != null;
		aObservers.add(pObserver);
	}
	


	public void push(Card pCard)
	{
	   super.push(pCard);
	   for(Observer observer : aObservers)
	   {
	      observer.sizeChanged(this);
	   }
	}
		
	public Card draw()
	{
	   Card card = super.draw();
	   for(Observer observer : aObservers)
	   {
	      observer.hasDrawn(this);
	   }
	   return card;
	}
}
