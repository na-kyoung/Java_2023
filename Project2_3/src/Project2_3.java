// 하나의 문자(+, -, *, /) 와 두개의 실수형 숫자를 입력 받아 간단한 계산기

import java.util.Scanner;

public class Project2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals() : string 비교
		// if (num1 == num2) : 숫자 비교
		// if (str1 == str2) : 문자열 비교 XX
		// if (str1.equals(str2)) : 문자열 비교 O
		
		Scanner scan = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("연산자 입력 : ");
		String a = scan.next();
		System.out.print("첫번째 숫자 입력 : ");
		num1 = scan.nextDouble();
		System.out.print("두번째 숫자 입력 : ");
		num2 = scan.nextDouble();
		
		if (a.equals("+")) //더하기
			System.out.println(num1 + num2);
		else if (a.equals("-")) //빼기
			System.out.println(num1 - num2);
		else if (a.equals("*")) //곱하기
			System.out.println(num1 * num2);
		else //나누기
			System.out.println(num1 / num2);

	}

}
