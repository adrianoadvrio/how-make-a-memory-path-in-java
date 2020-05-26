package handsonday4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("test.txt"));
		
		List<String> t = new ArrayList<String>();
		
	  while(in.hasNextLine()) {
		  t.add(in.nextLine());
	  }
		
		for(int i=0; i < t.size(); i++) {
		  System.out.println("Nombre: " + t.get(i));
	   }
		
		in.close();
}
}