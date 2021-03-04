package AllStringRelated;

public class ReverseString1 {
	
	
	public static String reverseString(String input) {
		
		if(input.equals("") || input.length() == 1)
			return input;
		
		String reverse = "";
		char[] stringArr = input.toCharArray();
		
		for(int i=input.length()-1; i>=0; i--) {
			reverse = reverse + stringArr[i];
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Reverse String "+reverseString("str"));
	}

}
