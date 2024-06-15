

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BillCalculatorTest {

	@Test
	void testRoundUpNearestCent() {
		assertEquals(3.12, BillCalculator.roundUpNearestCent(3.11111)); 
		assertEquals(2.00, BillCalculator.roundUpNearestCent(1.995432)); 
		assertEquals(5.00, BillCalculator.roundUpNearestCent(5.00)); 
		assertEquals(0.01, BillCalculator.roundUpNearestCent(0.00000099));
	}
	
	@Test
	void testCalculateTip() {
		assertEquals(1.50, BillCalculator.calculateTip(10.0, 15));
		assertEquals(2.00, BillCalculator.calculateTip(10.0, 20));
		assertEquals(6.00, BillCalculator.calculateTip(40.00, 15));
		assertEquals(8.00, BillCalculator.calculateTip(40.00, 20));
		assertEquals(2.70, BillCalculator.calculateTip(26.99, 10)); //2.699 round up
		assertEquals(5.91, BillCalculator.calculateTip(39.37, 15)); //5.9055 round up
	}
	
	@Test
	void testCalculateCostPerPerson15Percent() {
		assertEquals(5.75, BillCalculator.calculateCostPerPerson(10, 2));
		assertEquals(2.30, BillCalculator.calculateCostPerPerson(10, 5));
		assertEquals(23.00, BillCalculator.calculateCostPerPerson(40, 2));
		assertEquals(9.20, BillCalculator.calculateCostPerPerson(40, 5));
		assertEquals(15.10, BillCalculator.calculateCostPerPerson(39.37, 3)); //15.09333.. round up
	}
	
	@Test
	void testCalculateCostPerPerson20Percent() {
		assertEquals(2.00, BillCalculator.calculateCostPerPerson(10, 6));
		assertEquals(8.00, BillCalculator.calculateCostPerPerson(40, 6));
	}

}
