package handsonday7;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;

public class MySweetProgram3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Joao");
		names.push("Adriano");
		names.push("Maria");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(String s:names) { 
//			System.out.println(s);
//		}
//		
		
		}
	}
