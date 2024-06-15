

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ChangeConverterTest {
	
	@Test
	public void testPenniesToQuarters() {
		assertEquals(1, ChangeConverter.penniesToQuarters(25));
		assertEquals(2, ChangeConverter.penniesToQuarters(50));
		assertEquals(0, ChangeConverter.penniesToQuarters(24));
		assertEquals(3, ChangeConverter.penniesToQuarters(80));
		assertEquals(7, ChangeConverter.penniesToQuarters(199));
	}
	
}
