// 키보드에서 영문자 하나를 읽어서 모음과 자음을 구분하는 프로그램
// 향상된 switch case문 (jdk 12 이후)

import java.util.Scanner;

public class Project2_5_develop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = scan.next();
		
		// quit 입력할 때까지 실행
		while(!str.equals("quit")){
			// 자음,모음 구분
			switch(str) {
			case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" ->
				System.out.println("모음");
			default ->
				System.out.println("자음");
			}
			System.out.print("문자 입력 : ");
			str = scan.next();
		}
		System.out.println("프로그램 종료");

	}

}
