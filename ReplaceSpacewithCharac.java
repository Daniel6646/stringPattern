package stringPrograms;

public class ReplaceSpacewithCharac {
	
	public static void main(String args[]) {
		
		  String string = "Once in a blue moon";
		  char  c ='-';
		  
		  string = string.replace(' ', c);
		  //string = string.replace(' ', c);    
          
		  System.out.println("String after replacing space: "+string);
	}
}
