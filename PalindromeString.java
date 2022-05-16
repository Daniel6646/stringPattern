package stringPrograms;

public class PalindromeString {

	public static void main(String args[]) {
		String str = "Kayak"; //MADAM Also a palindrome
		boolean flag =true;
		
		str = str.toLowerCase();
		
		for(int i=0; i< str.length()/2; i++) {
			
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println("This is a palindrome string");
		else {
			
			System.out.println("This is not a palindrome string");
		}
		
	}
	
}
