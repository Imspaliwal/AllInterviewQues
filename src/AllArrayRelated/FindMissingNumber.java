package AllArrayRelated;

import java.util.Arrays;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 6, 7, 8};
		
		// Assume Array length because of missing number
		int arrLength = arr.length + 1;
		
		// Get sum of integer between 1 to arr.lenght + 1
		int total = arrLength * (arrLength + 1) / 2;
		
		System.out.println(total);
		
//		int arrSum = 0;
//		
//		for(int i=0; i<arr.length-1; i++) {
//			
//			arrSum = arr[i] + arrSum;
//			
//		}
		
		int arrSum = Arrays.stream(arr).sum();
		
		System.out.println(arrSum);
		
		// The missing nuhmber will be difference between expected sum and actual sum
		
		System.out.println(total - arrSum);
	}
	

}
