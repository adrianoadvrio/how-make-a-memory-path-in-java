package handsonday7;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;

public class MySweetProgram3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> nombres = new LinkedList<String>();
		nombres.push("Joao");
		nombres.push("Adriano");
		nombres.push("Maria");
		
		Iterator<String> it = nombres.iterator();
		
		for(String s:nombres) {
			System.out.println(s);
		}
		
		
		}
	}
