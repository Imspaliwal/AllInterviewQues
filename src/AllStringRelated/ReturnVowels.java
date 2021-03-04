package AllStringRelated;

import java.util.Arrays;

public class ReturnVowels {
	
	public static void main(String[] args) {
		giveVowel("sumit");
	}
	
	public static void giveVowel(String input) {
		
		String[] arr = input.split("");
		String result = "";
		
		Arrays.stream(arr).forEach(x -> System.out.println(x));
		
		System.out.println("---------------------");
		for(String a : arr) {
			if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
				result = result + a;
			}
				
		}
		
		System.out.println(result);
	}

}
