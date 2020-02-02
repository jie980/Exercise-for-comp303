package chex5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testmin {
	
	@Test
	public void testmin_int_2nd_greater() {
		int result = Math.min(1, 3);
		assertEquals(result,1);
	
		
	}
	@Test
	public void testmin_int_equalpoistive() {
		int result = Math.min(5, 5);
		assertEquals(result,5);
	}
	
	@Test
	public void testmin_int_1st_greater() {
		assertEquals(5,Math.min(6, 5));
	}
	@Test
	public void testmin_int_equalnegative() {
		int result = Math.min(-5, -5);
		assertEquals(result,-5);
	}

}
