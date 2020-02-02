package chex5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class testconcat {
	private final String empty= "";
	private final String nonempty="abb";
	@Test
	public void test_empty(){
		assertEquals(nonempty,empty.concat(nonempty));
	}
	@Test
	//因为If the length of the argument string is 0, then this String object is returned.
	public void test_empty2() {
		assertSame(nonempty,nonempty.concat(""));
		
	}
	@Test
	public void test_nonempty() {
		assertEquals("abb","a".concat("bb"));
	}
	@Test
	public void test_bothempty() {
		assertSame(empty,empty.concat(""));
	}
	
	@Test
	public void test_null() {
		assertThrows(NullPointerException.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				nonempty.concat(null);
				
			}
			
		});
	}
}
