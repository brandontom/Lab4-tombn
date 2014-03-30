import java.util.ArrayList;


public class PrimeNumber {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (i <= 1)
			return result;
		
		for(int candidate = 2; i > 1; candidate++){
			if(i % candidate == 0){
				i = i / candidate;
				result.add(candidate);
				candidate = 1;
			}
		}
		
		return result;
	}
	
}
