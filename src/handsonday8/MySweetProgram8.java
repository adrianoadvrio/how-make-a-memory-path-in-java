package handsonday8;



public class MySweetProgram8 {

	public static void main(String[] args)  {
		
		int [][] data = {
				{4,6,3,10},
				{4,2,40,1,5,7,4,3}, 
				{5,34,1,43}
		};
		
		
		
		//System.out.println(data.length); // size of outside array 
		//System.out.println(data[0].length); // size of first inner array
		//System.out.println(data[1].length); // size of second inner array
		
		
		for (int i = 0; i < data.length; i++) { // fist i=0 (data[i).length = 4 and so on
			for (int j = 0; j < data[i].length; j++) {  //// fist i=0 (data[i).length until 4 and so on
					System.out.print(data[i][j] + " ");//print with j actualization on every interaction
			   	}
			    System.out.println();
		   }
		}
	}
