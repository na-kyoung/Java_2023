// 컴퓨터가 생성한 난수(0 ~ 100)를 맞추는 업다운 게임
// java.lang - Math - random

import java.util.Scanner;
public class Project2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double num = Math.random(); //실수 난수 (0<=x<1)
//		System.out.println(num);
//		
//		int num1 = (int)Math.random(); //정수 0만 출력
//		System.out.println(num1);
//		
//		// 로또 숫자 출력 (1~45)
//		int num2 = (int)(Math.random()*45)+1; //1~45
//		System.out.println(num2);

		// 업다운 게임 (0~100)
		int answer = (int)(Math.random()*101);
		int num;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("정답을 추측해보세요: ");
			num = scan.nextInt();
			count += 1;
			if(num > answer) {
				System.out.println("DOWN");
			}
			if(num < answer) {
				System.out.println("UP");
			}
		} while(answer != num);
		System.out.println("정답! " + answer);
		System.out.println("횟수: " + count + "번");
		
	}

}
