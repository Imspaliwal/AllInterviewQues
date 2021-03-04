package AllStringRelated;

public class FindDuplicateCharacters {
	
	public static void charCount(String input) {
		
		
		int count = 0;
		char[] arr = input.toCharArray();
		int inputLen = arr.length;
		
		for(int i=0; i<inputLen; i++) {
			char ch = arr[i];	// take first character
			for(int j = i+1; j<inputLen; j++) {
				if(arr[j] == ch) {	// if find same character again in string
					for(int k=j; k<inputLen-1; k++) {	// shift character left
						arr[k] = arr[k+1];
						inputLen--;
						j=i; // if occurrence of char more than once 
					}
				}
			}
		}
		
		
		for(int i=0; i<inputLen; i++) {
			count = 0;
			
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == input.charAt(j))
					count++;
			}
			if(count > 1)
				System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		charCount("sumitsu");
	}

}
