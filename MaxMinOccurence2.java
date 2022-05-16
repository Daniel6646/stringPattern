package stringPrograms;

public class MaxMinOccurence2 {

	public static void main(String args[]) {
		
		String string= " grass is greener on the other side";
		int freq[] = new int [string.length()];
		int min,max;
		char minChar = string.charAt(0), maxChar = string.charAt(0);
		 
		char str[] = string.toCharArray();
		
		for(int i=0; i<str.length; i++) {
			freq[i] =1;
			for(int j=i+1; j<str.length; j++) {
				if(str[i] == str[j] && str[i] !=' ' && str[i] !=0) {
					
					freq[i]++;
					
					str[j] = 0;
					
				}
			}
		}
		
		
		min = max = freq[0];
		for(int i=0; i<freq.length; i++) {
			if(min > freq[i]) {
				
				min =freq[i];
				minChar = str[i];
			}
			
			
			if(max < freq[i]) {
				
				max = freq[i];
				maxChar = str[i];
				
			}
		}
		
		System.out.println("Minimum occurring character: " + minChar);    
	      System.out.println("Maximum occurring character: " + maxChar);   
		
	}
}
