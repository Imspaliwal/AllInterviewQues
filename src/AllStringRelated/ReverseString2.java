package AllStringRelated;

import java.util.Scanner;

public class ReverseString2 {
	
	public static String reverse(String input) {
		
		if(input == null || input.isEmpty()) {
			return input;
		}
		
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
		//     last character                   + remaining characters
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(reverse(str));
	}	

}
