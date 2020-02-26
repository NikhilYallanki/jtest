package epam.jtesting.estimates;
import static org.junit.Assert.*;

import org.junit.Test;				



public class Construction {

	@Test
	public void test() {
		Estimator costEstimator =new Estimator();
		assertEquals(15000,costEstimator.estimatedCostForConstruction(2,10,false),0);
		assertEquals(-1,costEstimator.estimatedCostForConstruction(2,10,true),0);
		assertEquals(25000,costEstimator.estimatedCostForConstruction(3,10,true),0);
		assertEquals(18000,costEstimator.estimatedCostForConstruction(3,10,false),0);
		assertEquals(12000,costEstimator.estimatedCostForConstruction(1,10,false),0);
		assertEquals(-1,costEstimator.estimatedCostForConstruction(1,10,true),0);
		assertEquals(-1,costEstimator.estimatedCostForConstruction(6,10,true),0);
	}

}