package AllMiscellaneous;

public class OccurenceOfANumber {

	
	public static void main(String[] args) {
		System.out.println(occerenceOfNumber(111234, 1));
		System.out.println(occerenceOfNumber(111234, 4));
	}
	
	
	public static int occerenceOfNumber(int input, int number) {
		
		int count = 0;
		
		while(input>0) {
			if(input % 10 == number) {
				count ++;
			}
			input = input / 10;
		}
		return count;
	}
}
