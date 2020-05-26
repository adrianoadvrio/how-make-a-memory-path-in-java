package handsonday5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> nombres = new LinkedList<String>();
		nombres.add("Joao");
		nombres.add("Adriano");
		nombres.add("Maria");
		
		//System.out.println(nombres.remove());
		System.out.println(nombres.removeLast());
	}
}