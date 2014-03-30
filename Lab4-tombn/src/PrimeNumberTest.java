import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeNumberTest {

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
	
	@Test
	public void testThree() {
		assertEquals(makeList(3), PrimeNumber.generateFactors(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(makeList(2, 2), PrimeNumber.generateFactors(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(makeList(2,3), PrimeNumber.generateFactors(6));
	}
	
	public ArrayList<Integer> makeList(int... ints) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i : ints) {
			result.add(i);
		}
		return result;
	}

}
