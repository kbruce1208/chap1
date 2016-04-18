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
		public void testMulti() {
			SimpleCalculator chap = new SimpleCalculator();
			chap.multi(10, 20);
			assertEquals(200,chap.getResult());
		
		
	}

		
		
		
	
		public void testInc() {
			SimpleCalculator chap = new SimpleCalculator();
			chap.inc(100);
			assertEquals(100,chap.getResult());
			chap.inc(200);
			assertEquals(300,chap.getResult());
		
		
	}



}
