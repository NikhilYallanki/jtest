package epam.jtesting;
import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleinterestTest {

	@Test
	public void test() {
		Simpleinterest s = new Simpleinterest();
		double op = s.SimpleInterestCalculator(2000.0, 3.0, 6.0);
		assertEquals(360, op,0);
	}

}
