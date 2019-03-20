package epaminterest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateinterestTest {

	@Test
	void testsimpleinterest() {
		Calculateinterest ci=new Calculateinterest();
		
		assertEquals(2500, ci.simpleinterest(10000, 5, 5));
		assertEquals(210, ci.simpleinterest(3000, 7, 1));
		assertEquals(10000, ci.simpleinterest(5000, 1, 2));
		
	}
	@Test
	void testcompoundinterest() {
		Calculateinterest ci=new Calculateinterest();
		assertEquals(1333.099243, ci.compoundinterest(1200, 2, 5.4));
		assertEquals(16288.946267774416, ci.compoundinterest(10000,5,10.25));
	}

}
