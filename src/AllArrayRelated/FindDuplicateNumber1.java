package AllArrayRelated;

import java.util.Arrays;

public class FindDuplicateNumber1 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 5, 9, 9, 1};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println("Duplicate Number is : "+arr[i]);
			}
		}
		
	}

}
