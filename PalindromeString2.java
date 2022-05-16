package stringPrograms;

import java.util.Scanner;

public class PalindromeString2 {
	
	public static void main(String args[]) {
		
		String str,rev ="";
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a a string");
			str = scanner.next();
		}
		str = str.toLowerCase();
		
		for(int i=str.length()-1; i >=0;i--) {
			
			rev = rev + str.charAt(i);
			
		}
		
		if(str.equals(rev)) {
			
			System.out.println(str + " is a palindrome string");
		}
		else {
			
			System.out.println(str + " is not a palnidrome string");
		}
		
	}
}
