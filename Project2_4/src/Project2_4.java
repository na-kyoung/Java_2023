// 세 개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램

import java.util.Scanner;
public class Project2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 입력 nextInt()
		Scanner scanner = new Scanner(System.in); // Scanner 클래스 객체 생성
		int num1, num2, num3, max;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		System.out.print("d");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		System.out.println("세번째 숫자를 입력하세요 : ");
		num3 = scanner.nextInt();
		
		max = num1;
		if (num1 < num2) {
			max = num2;
			if (num2 < num3)
				max = num3;
			else
				max = num2;
		} else {
			if (num1 < num3)
				max = num3;
		}
		System.out.println("max : " + max);
		
		
		}

}

