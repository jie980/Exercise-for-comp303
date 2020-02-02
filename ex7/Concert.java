package chex7;

public class Concert extends AbstractShow
{

	private String aPerformer;

	
	public Concert(String pTitle, String pPerformer, int pTime)
	{
		super(pTitle,pTime);

		aPerformer = pPerformer;

	}
	public Concert(Concert pconcert) {
		super(pconcert.title(),pconcert.time());
		aPerformer = pconcert.aPerformer;
	}
	
//	ex5需要
//	@Override
//	public String description()
//	{
//		return String.format("%s by %s",super.title(), aPerformer);
//	}
	@Override
	public String extra() {
		return " by "+aPerformer;
	}

	@Override
	public Concert Clone() {
		
		try {
			//不用写格外的东西因为field都是primitive的。
			//如果field里有list则要deepcopy list。
			return (Concert)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}


}