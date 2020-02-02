package chex6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DoubleBill implements Show{
	private Movie s1 ;
	private Movie s2;
	
	public DoubleBill(Movie ps1,Movie ps2) {
		s1 = new Movie(ps1);
		s2 = new Movie(ps2);
	}

	@Override
	public String description() {
		
		return s1.description()+" and "+s2.description();
	}

	@Override
	public int runningTime() {
		
		return s1.runningTime()+s2.runningTime();
	}

	@Override
	public DoubleBill copy() {

		return new DoubleBill(s1.copy(),s2.copy());
	}
	
	public int hashCode() {
		return Objects.hash(s1,s2);
	}
	
	public boolean equals(Object o1) {
		if (o1.getClass() != this.getClass()) return false;
		if (o1 == null) return false;
		DoubleBill d = (DoubleBill) o1;
		return s1.equals(d.s1) && s2.equals(d.s2);
	}
	
	
	

	
	

}
