package AllMiscellaneous;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		System.out.println(isNumberArmstring(153));
		System.out.println(isNumberArmstring(371));
		System.out.println(isNumberArmstring(154));
	}
	
	// the Sum of the cubes of the indivisual number is equal to number i.e. 153
	
	public static boolean isNumberArmstring(int number) {
		
		
		int temp = number;
		int rem = 0;
		
		int sum = 0;
		
		while(temp > 0) {
			
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
			
		}
		
		if(sum==number)
			return true;
		
		return false;
		
	}

}
