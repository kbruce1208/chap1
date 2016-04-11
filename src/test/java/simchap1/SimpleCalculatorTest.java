package simchap1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testadd() {
		SimpleCalculator chap = new SimpleCalculator();
		chap.add(10, 20);
		assertEquals(30,chap.getResult());
		
	}
		@Test
		public void testSub() {
			SimpleCalculator chap = new SimpleCalculator();
			chap.sub(10, 20);
			assertEquals(-10,chap.getResult());
		
		
	}
		@Test
		public void testDiv() {
			SimpleCalculator chap = new SimpleCalculator();
			chap.div(100, 20);
			assertEquals(5,chap.getResult());
		
		
	}


}
