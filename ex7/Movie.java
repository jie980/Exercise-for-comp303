package chex7;

/**
 * Represents a show that consists of the screening of a single movie.
 */
public class Movie extends  AbstractShow{
	private int aYear;
	
	public Movie(String pTitle, int pYear, int pTime)
	{
		super(pTitle,pTime);
		aYear = pYear;
	}


//	ex5需要
//	@Override
//	public String description()
//	{
//		return String.format("%s (%d)", super.title(), aYear);
//	}
	
	@Override
	public String extra() {
		
		return " in "+aYear;
	}
	//ex9
	
	public void setRecommended(Movie pMovie) {
		super.setRecommended(pMovie);
	}
	@Override
	public Movie getRecommended() {
		return (Movie)super.getRecommended();
	}
//	违反了Lisko substition principle 
	//1.strict precondition
	//2.more checked exception
//	@Override
//	public void setTitle(String pTitle) {
//		throw new UnsupportedOperationException();
//	}
//	@Override
//	public void setTime(int pTime) {
//		assert pTime>10;
//		super.setTime(pTime);
//	}


	@Override
	public Movie Clone() {
		// TODO Auto-generated method stub
		try {
			//不用写格外的东西因为field都是primitivede
			return (Movie) super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}