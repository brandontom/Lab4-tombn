import java.util.ArrayList;


public class PrimeNumberGenerator {

	
	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (i <= 1)
			return result;
		if (i >= 2){
			result.add(2);
		}
		return result;
	}
	
}
