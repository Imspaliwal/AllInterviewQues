package AllStringRelated;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		System.out.println(reverse(12));
		
	}
	
	public static int reverse(int input) {
		
		int rem = 0;
		int result = 0;
		
		while(input>0) {
			
			rem = input % 10;
			result = result * 10 + rem;
			input = input / 10;
			
		}
		
		return result;
		
	}

}


