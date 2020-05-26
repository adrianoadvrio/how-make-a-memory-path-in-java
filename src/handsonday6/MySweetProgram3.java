package handsonday6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram3 {

	public static void main(String[] args)  {
		
		LinkedList<String> stack = new LinkedList<String>();
		stack.push("1 in ");
		stack.push("2 in");
		stack.push("3 in");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}