import java.util.ArrayList;


public class PrimeNumber {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (i <= 1)
			return result;
		while (i % 2 == 0){
			result.add(2);
			i/=2;
		}
		if (i % 3 == 0){
			result.add(3);
		}
		return result;
	}
	
}
