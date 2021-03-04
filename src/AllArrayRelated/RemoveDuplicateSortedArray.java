package AllArrayRelated;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
	
	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 3, 4, 5, 5, 6};
		
		int i = 0; 
		int j = 1;
		
		while(j < input.length) {
			if(input[j] == input[i]) {
				j++;
			}else {
				input[++i] = input[j++];
			}
		}
		
		int[] result = new int[i+1];
		
		for(int k=0; k<result.length; k++) {
			result[k] = input[k];
		}
		
		Arrays.stream(result).forEach(x -> System.out.println(x))
		;
		
		
	}

}

//j				i
//1				0
//[2]				[1]	No
//[2]				[2]
		
