package chex7;

public class SponsoredConcert extends Concert{
	private String sponsorName;
	private int sponsorTime;
	public SponsoredConcert(String pTitle, String pPerformer, int pTime, String psponsorName, int psponsorTime) {
		super(pTitle, pPerformer, pTime);
		sponsorName = psponsorName;
		sponsorTime = psponsorTime;
	}

	public String extra(){
		return super.extra()+" sponsored by "+sponsorName;
	}
	
	@Override
	public int time() {
		return super.time()+sponsorTime;
	}

}
