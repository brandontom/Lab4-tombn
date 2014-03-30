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
		assertEquals(makeList(), PrimeNumber.generateFactors(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(makeList(2), PrimeNumber.generateFactors(2));
	}

	
	public ArrayList<Integer> makeList(int... ints) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i : ints) {
			result.add(i);
		}
		return result;
	}
}
