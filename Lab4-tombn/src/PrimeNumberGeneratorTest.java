import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeNumberGeneratorTest {

	@Test
	public void testifTrueisTrue() {
		assertTrue("assertTrue failed..", true);
	}
	
	@Test
	public void testOne() {
		assertEquals(makeList(), PrimeNumberGenerator.generatePrimes(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(makeList(), PrimeNumberGenerator.generatePrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(makeList(2), PrimeNumberGenerator.generatePrimes(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(makeList(2, 3), PrimeNumberGenerator.generatePrimes(4));
	}
	
	@Test
	public void testNine() {
		assertEquals(makeList(2, 3, 5, 7), PrimeNumberGenerator.generatePrimes(9));
	}

	
	public ArrayList<Integer> makeList(int... ints) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i : ints) {
			result.add(i);
		}
		return result;
	}
}
