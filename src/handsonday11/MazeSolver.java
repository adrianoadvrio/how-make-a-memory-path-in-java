package handsonday11;

import java.util.LinkedList;

public class MazeSolver {

	static int[][] maze = { { 2, 0, 1, 1 }, 
			                { 1, 1, 1, 0 }, 
			                { 0, 0, 0, 1 } };

	// 0 = wall
	// 1 = path
	// 2 = destination

	static LinkedList<Position> path = new LinkedList<Position>(); // store lasted position

	public static void main(String[] args) {

		Position p = new Position(0, 3); 
		path.push(p);

		while (true) {
			
			int y = path.peek().y; // row      //update positions 
			int x = path.peek().x; // column
			
			
			maze[y][x] = 0;    // mark as zero the last position
			
			
            if(isValid(y+1, x)) {
            	// down
    			if (maze[y + 1][x] == 2) {
    				System.out.println("Moved down, You won");
                    return;
    			} else if (maze[y + 1][x] == 1) { // to walk must be '1' (path) if not ..another direction
    				System.out.println("Move down");
    				path.push(new Position(y + 1, x));
    				continue; // go to the next iteration of the loop
    			}
            }
			

             if(isValid(y, x-1)) {
            	// left
     			if (maze[y][x-1] == 2) {
     				System.out.println("Moved left, You won");
     				 return;
     			} else if (maze[y][x-1] == 1) {
     				System.out.println("Move left");
     				path.push(new Position(y, x-1));
     				continue; // go to the next iteration of the loop
     			}
             }
             
             
             if(isValid(y-1, x)) {
            	// up
     			if (maze[y - 1][x] == 2) {
     				System.out.println("Moved up, You won");
     				 return;
     			} else if (maze[y - 1][x] == 1) {
     				System.out.println("Move up");
     				path.push(new Position(y - 1, x));
     				continue; // go to the next iteration of the loop
     			} 
             }
			
			
            if(isValid(y, x + 1)) {
            	// right
    			if (maze[y][x + 1] == 2) {
    				System.out.println("Moved right, You won");
    				 return;
    			} else if (maze[y][x + 1] == 1) {
    				System.out.println("Move right");
    				path.push(new Position(y, x + 1));
    				continue; // go to the next iteration of the loop
    			}
            }
			
			
			path.pop();
			System.out.println("Moved back");
			if(path.size() <= 0) {
				System.out.println("no path");
				return;
			}

		}

	}
	
	public static boolean isValid(int y, int x) {
		if(y < 0 || 
		   y >= maze.length ||
		   x < 0 || 
		   x >= maze[y].length ) {
			return false;
		}
		
		return true;
	}

}
