package stringPrograms;

public class LowerCaseToUppercase {

	public static void main(String args[]) {
		
		String str = "Great Power";
		
		StringBuffer newStr = new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			
			
			if(Character.isLowerCase(str.charAt(i))) {
				
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				
			}
			
			if(Character.isUpperCase(str.charAt(i))) {
				
				
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.print("String after conversion : "+newStr);
	}
	
}
