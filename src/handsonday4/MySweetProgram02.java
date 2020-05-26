package handsonday4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MySweetProgram02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner("test.txt");
		
	  while(in.hasNextLine()) {
		   System.out.println(in.nextLine());
		   
	   }
		
		in.close();
}
}