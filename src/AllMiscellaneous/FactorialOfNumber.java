package AllMiscellaneous;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(4));
	}
	
	public static int factorial(int input) {
		
		int fact = 1; 
		
		while(input>0) {
			fact = fact * input;
			input--;
		}
		return fact;
		
	}

}
