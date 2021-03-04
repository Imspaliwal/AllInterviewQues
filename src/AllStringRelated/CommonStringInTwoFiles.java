package AllStringRelated;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CommonStringInTwoFiles {
	
	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir + "\\file1");
		System.out.println(fileContent(currentDir + "\\file1.txt"));
		findCommonString();
	}
	
	public static void findCommonString() throws IOException {
		
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		
//		File file = new File("C:\\Users\\namit\\eclipse-workspace\\AllInterviewQues\\file1.txt");
		
	}
	
	public static String fileContent(String filePath) throws IOException {
		
		File file = new File(filePath);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String content;
		
		while((content = br.readLine()) != null) {
			System.out.println(content);
		}
		
		br.close();
		return content;
	}
	
	

}
