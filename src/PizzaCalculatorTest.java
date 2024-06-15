

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PizzaCalculatorTest {
	
	@Test
	public void testCalculateArea() {
		double delta = 0.01;
		assertEquals(3.14, PizzaCalculator.calculateArea(1), delta);
		assertEquals(78.53, PizzaCalculator.calculateArea(5), delta);
		assertEquals(153.93, PizzaCalculator.calculateArea(7), delta);
	}
	
	@Test
	public void testCalculateCaloriesPerPizza() {
		assertEquals(1570, PizzaCalculator.calculateCaloriesPerPizza(10));
		assertEquals(3078, PizzaCalculator.calculateCaloriesPerPizza(14));
	}
	
	@Test
	public void testCalculateCaloriesPerSlice() {
		assertEquals(261, PizzaCalculator.calculateCaloriesPerSlice(10, 6));
		assertEquals(384, PizzaCalculator.calculateCaloriesPerSlice(14, 8));
	}


}
