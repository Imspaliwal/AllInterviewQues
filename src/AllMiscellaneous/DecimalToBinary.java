package AllMiscellaneous;

public class DecimalToBinary {

	public static void main(String[] args) {
		toBinary(10);
	}
	
	public static void toBinary(int decimalNumber) {
		
		int[] binary = new int[40];
		int index = 0;
		
		// Take Decimal Number as Dividend
		// Divide Number by 2 (2 is a base of binary)
		// Store remainder in array (it will be 0 or 1, because of divisor is 2)
		// repeat the two steps until number is greater than zero
		// Print the array in reverse order (which is equal to binary number of given number)
		
		while(decimalNumber > 0) {
			binary[index++] = decimalNumber % 2;
			decimalNumber = decimalNumber/2;
		}
		
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
	}

}
