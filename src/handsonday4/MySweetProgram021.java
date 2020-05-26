package handsonday4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MySweetProgram021 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("test.txt"));
		
	  while(in.hasNextLine()) {
		   System.out.println(in.nextLine());
		   
	   }
		
		in.close();
}
}