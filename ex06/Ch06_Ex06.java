package ex06;

import java.util.Calendar;
import java.util.Scanner;



public class Ch06_Ex06 {
	
	public static void print(String msg, Calendar cal){
		
		int second =cal.get(Calendar.SECOND);
		System.out.println(msg+second); // ���� �� 
		
		
	}
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
	
		
		
	
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		
		
		System.out.print("Ȳ���� ���� <Enter>Ű>>");
		scan.nextLine();
		print("+++���� �� �ð�=  ",now);
		
		
		System.out.print("10�� ������ <Enter>Ű>>");
		scan.nextLine();
		print("+++���� �� �ð�=  ",now);
		
		
		System.out.print("���繮 ���� <Enter>Ű>>");
		scan.nextLine();
		print("+++���� �� �ð�=  ",now);
	
		
		
		
		
		
	}

}
