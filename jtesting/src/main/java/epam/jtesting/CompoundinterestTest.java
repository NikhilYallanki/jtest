package epam.jtesting;
import static org.junit.Assert.*;

import org.junit.Test;



public class CompoundinterestTest {

	@Test
	
	public void test() {
		Compoundinterest compoundinterestTest = new Compoundinterest();
		double op = compoundinterestTest.CompoundInterestCalculator(2000, 12, 5, .08);
		assertEquals(979.6914166032102, op,0);
	}
}