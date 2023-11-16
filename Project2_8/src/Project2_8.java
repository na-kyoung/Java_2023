// 크기가 3인 문자열 배열을 생성한 후, 단어를 입력받아 출력하는 프로그램
// for문, length 이용

import java.util.Arrays;
import java.util.Scanner;

public class Project2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 크기 3의 배열 생성
		String[] str = new String[3];

		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 입력 받은 단어 배열에 삽입
		for (int i=0;i<str.length;i++) {
			System.out.print("단어 : ");
			//String txt = scan.next();
			//str[i] = txt;
			
			str[i] = scan.next();
		}
		
		// 1. 배열 출력 - Arrays
		System.out.println(Arrays.toString(str));
		
		// 2-1. 배열 출력 - for문
		for (int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		// 2-2. 배열 출력 - 향상된 for문
		// for (타입 변수 : 배열)
		// str 배열 원소값을 하나씩 꺼내서 s에 대입
		for (String s : str)
			System.out.println(s);
		
		// 3. 향상된 for문 실습 - 정수 배열 출력
//		int[] num = new int[3];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
		int[] num = {1,2,3};

		// 배열 출력 - 향상된 for문
		for (int i : num)
			System.out.println(i);
	}

}
