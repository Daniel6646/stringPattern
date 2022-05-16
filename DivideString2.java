package stringPrograms;

public class DivideString2 {
	
	public static void main(String args[]) {
		
		String str = "aaaabbbbcccc";
		
		int len = str.length();
		int n=3;
		int temp =0, chars =len/3;
		String equalString[] = new String[n];
		
		if(len / n != 0) {
			
			System.out.println("The string cannot be divided into n parts");
		}
		
		else {
			for(int i=0; i<str.length(); i=i+chars) {
				
				String part = str.substring(i, i+chars);
				equalString[temp]= part;
				temp++;
		
			}
			
			System.out.println(n+ " equal parts of the string are ");
			for(int i=0; i<equalString.length;i++) {
				System.out.println(equalString[i] + " ");
				
				
			}
			
			
			
		}
		
		
		
		
	}

}
