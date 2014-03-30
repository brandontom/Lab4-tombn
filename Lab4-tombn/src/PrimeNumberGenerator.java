import java.util.ArrayList;


public class PrimeNumberGenerator {

	
	public static ArrayList<Integer> generatePrimes(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int j = 2; j < i; j++){
			if (isPrime(j)){
				result.add(j);
			}
		}
		return result;
	}
	
	public static boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
	
}
