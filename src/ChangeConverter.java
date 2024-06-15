

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeConverter {
	
	public static int penniesToQuarters(int pennies) {
		return pennies / 25;
	}
	
	public static void main(String[] args) {
		assertEquals(1, penniesToQuarters(25));
		assertEquals(2, penniesToQuarters(50));
		assertEquals(0, penniesToQuarters(24));
		assertEquals(3, penniesToQuarters(80));
		assertEquals(7, penniesToQuarters(199));
		System.out.println("penniesToQuarters() tests passed");
	}

}
