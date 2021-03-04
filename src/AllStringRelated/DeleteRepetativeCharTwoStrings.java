package AllStringRelated;

public class DeleteRepetativeCharTwoStrings {
	
	public static void main(String[] args) {
		
		
		String str1 = "aBc";
		String str2 = "bcde";
		
		char[] ar1 = str1.toCharArray();
		char[] ar2 = str2.toCharArray();
		
		
		for(int i=0; i<ar1.length; i++) {
			boolean matchFalg = false;
			for(int j=0; j<ar2.length; j++) {
				
				if(String.valueOf(ar1[i]).toLowerCase().equals(
						String.valueOf(ar2[j]).toLowerCase())) {
					matchFalg = true;
					break;
				}
				
			}
			
			if(matchFalg) {
				str1 = str1.replaceAll(String.valueOf(ar1[i]).toUpperCase(), "");
				str1 = str1.replaceAll(String.valueOf(ar1[i]).toLowerCase(), "");
				str2 = str2.replaceAll(String.valueOf(ar1[i]).toLowerCase(), "");
				str2 = str2.replaceAll(String.valueOf(ar1[i]).toUpperCase(), "");
			}
			
		}
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	

}
