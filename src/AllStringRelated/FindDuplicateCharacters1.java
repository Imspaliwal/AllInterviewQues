package AllStringRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters1 {
	
	
	// 1. Get char array from string
	// 2. iterate through it and build map with character and their count
	// 3. iterate through map and print char which has appeared more than once
	
	
	public static void findDuplicate(String input) {
		
		char[] arr = input.toCharArray();
		
		// create map with char as key and their value count
		HashMap<Character, Integer> charDir = new HashMap<>();
		
		for(char c : arr) {
			
			// containsKey() return true if key is available in map (or char is already available in map)
			if(charDir.containsKey(c)) {
				// increase count if already available
				charDir.put(c, charDir.get(c)+1);
			}else {
				// or else add char with count 1
				charDir.put(c, 1);
			}
		}
		
		// iterate through map to print all duplicate value
		Set<Map.Entry<Character, Integer>> entrySet = charDir.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > 1)
				System.out.println("Character : "+entry.getKey() + " its Count : "+entry.getValue());
		}
		
	}
	
	
	public static void main(String[] args) {
		findDuplicate("Paliwal");
	}

}
