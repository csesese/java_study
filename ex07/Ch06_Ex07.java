package ex07;

import java.util.Scanner;
import java.util.StringTokenizer;

//class String{
//	
//}


public class Ch06_Ex07 {
	
	

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(">>");
		String query =scan.next();
		
		StringTokenizer st= new StringTokenizer(query,"\\s ");
		int n= st.countTokens();
		System.out.println("token°³¼ö"+ n);
		
		
		
		
	}

}
