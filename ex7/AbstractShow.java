package chex7;

public abstract class AbstractShow implements Show{
	private String aTitle;
	private int aTime;
	private Show aRecommended;
	public AbstractShow(String pTitle,int pTime) {
		aTitle = pTitle;
		aTime = pTime;
	}
	@Override
	public String title()
	{
		return aTitle;
	}

	
	@Override
	public int time()
	{
		return aTime;
	}
	public void setTitle(String pTitle)
	{
		aTitle = pTitle;
	}
	public void setTime(int pTime)
	{	assert pTime >0;
		aTime = pTime;
	}
	@Override
	public String description() {
		return title()+extra()+ time()+" minutes.";
	}
	public abstract String extra();
	//ex9
	public void setRecommended(Show pShow) {
		aRecommended = pShow;
		
	}
	public Show getRecommended() {
		return aRecommended;
	}
	
}
