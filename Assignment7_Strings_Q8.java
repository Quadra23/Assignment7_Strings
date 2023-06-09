
public class Assignment7_Strings_Q8 {
	
	    public static boolean checkStraightLine(int[][] coordinates) {
	        int deltaX = coordinates[1][0] - coordinates[0][0];
	        int deltaY = coordinates[1][1] - coordinates[0][1];

	        for (int i = 2; i < coordinates.length; i++) {
	            int currentDeltaX = coordinates[i][0] - coordinates[i - 1][0];
	            int currentDeltaY = coordinates[i][1] - coordinates[i - 1][1];

	            if (deltaX * currentDeltaY != deltaY * currentDeltaX) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
	        boolean isStraightLine = checkStraightLine(coordinates);
	        System.out.println(isStraightLine);
	    }
	}

