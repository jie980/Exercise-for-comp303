package chex6;

import java.util.Objects;

public class IntroducedShow implements Show {
	private Show ashow ;
	private int aspeechtime;
	private String aspeaker;
	
	public IntroducedShow(Show pshow,int speechtime,String pspeaker) {
		ashow =pshow;
		aspeechtime = speechtime;
		aspeaker = pspeaker;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return aspeaker+" introduce "+ashow.description();
	}

	@Override
	public int runningTime() {
		// TODO Auto-generated method stub
		return ashow.runningTime()+aspeechtime;
	}

	@Override
	public Show copy() {
		// TODO Auto-generated method stub
		return new IntroducedShow(ashow.copy(),aspeechtime,aspeaker);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(ashow, aspeaker, aspeechtime);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntroducedShow other = (IntroducedShow) obj;
		return Objects.equals(ashow, other.ashow) && Objects.equals(aspeaker, other.aspeaker)
				&& aspeechtime == other.aspeechtime;
	}
	
}
