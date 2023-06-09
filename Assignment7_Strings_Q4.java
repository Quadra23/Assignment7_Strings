
public class Assignment7_Strings_Q4 {
	
	    public static String reverseWords(String s) {
	        String[] words = s.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            String reversedWord = reverseString(word);
	            result.append(reversedWord);

	            if (i < words.length - 1) {
	                result.append(" ");
	            }
	        }

	        return result.toString();
	    }

	    private static String reverseString(String s) {
	        char[] chars = s.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;

	        while (left < right) {
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;

	            left++;
	            right--;
	        }

	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String s = "Let's take LeetCode contest";
	        String reversedWords = reverseWords(s);
	        System.out.println(reversedWords);
	    }
	}
