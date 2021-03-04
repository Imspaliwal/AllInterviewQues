package AllMiscellaneous;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println(primeNumber(1));
		System.out.println(primeNumber(2));
		System.out.println(primeNumber(3));
		System.out.println(primeNumber(4));
		System.out.println(primeNumber(5));
		System.out.println(primeNumber(6));
	
	}
	
	public static boolean primeNumber(int input) {
		
		
//		for(int i=2; i<=Math.sqrt(input); i++) {
		for(int i=2; i<=input/2; i++) {
			if(input % i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
