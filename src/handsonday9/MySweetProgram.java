package handsonday9;



public class MySweetProgram {

	public static void main(String[] args)  {
		
		int [][] data = {
				{4,6,3,10},
				{4,2,40,1,5,7,4,3},
				{5,34,1,43}
		};
		
		
		
		//System.out.println(data.length); // size of outside array 
		//System.out.println(data[0].length); // size of first inner array
		//System.out.println(data[1].length); // size of second inner array
		
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
					System.out.print(data[i][j] + " ");
			   	}
			    System.out.println();
		   }
		}
	}
