
public class Assignment7_Strings_Q2 {
	
	    public static boolean isStrobogrammatic(String num) {
	        int left = 0;
	        int right = num.length() - 1;

	        while (left <= right) {
	            char leftChar = num.charAt(left);
	            char rightChar = num.charAt(right);

	            if (!isStrobogrammaticPair(leftChar, rightChar)) {
	                return false;
	            }

	            left++;
	            right--;
	        }

	        return true;
	    }

	    private static boolean isStrobogrammaticPair(char left, char right) {
	        switch (left) {
	            case '0':
	                return right == '0';
	            case '1':
	                return right == '1';
	            case '6':
	                return right == '9';
	            case '8':
	                return right == '8';
	            case '9':
	                return right == '6';
	            default:
	                return false;
	        }
	    }

	    public static void main(String[] args) {
	        String num = "69";
	        boolean isStrobogrammatic = isStrobogrammatic(num);
	        System.out.println(isStrobogrammatic);
	    }
	}

