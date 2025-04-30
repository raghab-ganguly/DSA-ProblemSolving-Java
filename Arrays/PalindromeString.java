public class PalindromeString {
	public static void main(String... args) {
		if(isPalindrome(args[0])) System.out.println(args[0]+" is Palindrome");
		else System.out.println(args[0]+" is not Palindrome!!!");
	}
	public static boolean isPalindrome(String word){
		word = word.toLowerCase();
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = word.length()-1;
		
		while(start<end){
			if(charArray[start] != charArray[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}