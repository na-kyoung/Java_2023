// 키보드에서 영문자 하나를 읽어서 모음과 자음을 구분하는 프로그램

import java.util.Scanner;

public class Project2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = scan.next();
		
		// quit 입력할 때까지 실행
		while(!str.equals("quit")){
			// 자음,모음 구분
			switch(str) {
			case "A": case "E": case "I": case "O": case "U":
			case "a": case "e": case "i": case "o": case "u":
				System.out.println("모음");
				break;
			default:
				System.out.println("자음");
				break;
			}
			System.out.print("문자 입력 : ");
			str = scan.next();
		}
		System.out.println("프로그램 종료");

	}

}
