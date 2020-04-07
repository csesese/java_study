package ex06;

import java.util.Calendar;
import java.util.Scanner;



public class Ch06_Ex06 {
	
	public static void print(String msg, Calendar cal){
		
		int second =cal.get(Calendar.SECOND);
		System.out.println(msg+second); // 현재 초 
		
		
	}
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
	
		
		
	
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		
		System.out.print("황기태 시작 <Enter>키>>");
		scan.nextLine();
		print("+++현재 초 시간=  ",now);
		
		
		System.out.print("10초 예상후 <Enter>키>>");
		scan.nextLine();
		print("+++현재 초 시간=  ",now);
		
		
		System.out.print("이재문 시작 <Enter>키>>");
		scan.nextLine();
		print("+++현재 초 시간=  ",now);
	
		
		
		
		
		
	}

}
