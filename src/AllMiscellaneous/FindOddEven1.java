package AllMiscellaneous;

public class FindOddEven1 {
	
	// find odd even without % operator
	
	public static void main(String[] args) {
		
		isOddEven(12);
		isOddEven(3);
		
	}
	
	public static void isOddEven(int number) {
		
		if((number & 1) == 0) {
			System.out.println(number + " Number is Even");
		}else {
			System.out.println(number + " Number is Odd");
		}
		
	}

}
