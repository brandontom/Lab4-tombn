import java.util.ArrayList;


public class PrimeNumberGenerator {

	
	public static ArrayList<Integer> generatePrimes(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (i <= 1)
			return result;
		if (i > 2){
			result.add(2);
		}
		if (i > 3){
			result.add(3);
		}
		return result;
	}
	
}
