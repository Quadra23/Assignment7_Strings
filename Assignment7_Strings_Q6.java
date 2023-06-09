
public class Assignment7_Strings_Q6 {
	
	    public static boolean canShiftString(String s, String goal) {
	        if (s.length() != goal.length()) {
	            return false;
	        }

	        String shiftedString = s + s;
	        return shiftedString.contains(goal);
	    }

	    public static void main(String[] args) {
	        String s = "abcde";
	        String goal = "cdeab";
	        boolean canShift = canShiftString(s, goal);
	        System.out.println(canShift);
	    }
	}

