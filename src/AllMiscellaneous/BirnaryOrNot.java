package AllMiscellaneous;

public class BirnaryOrNot {
	
	public static void main(String[] args) {
		System.out.println(isBinary(11001011));
		System.out.println(isBinary(11001021));
	}
	
	public static boolean isBinary(int input) {
		
		while(input != 0) {
			if(input % 10 > 1) {
				return false;
			}
			input = input / 10;
		}
		return true;
		
	}

}
