// 0부터 입력 받은 정수까지의 3의 배수를 출력하고, 그 합을 구하는 프로그램
// 한 줄에 5개의 숫자만 출력

import java.util.Scanner;
public class Project2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = scanner.nextInt();
		
		// 변수 선언
		int sum = 0;
		int count = 0;
		
		// 내가 작성
		// 3의 배수 출력 & 합 구하기
		for (int i=0; i<=x; i++) {
			if (i % 3 == 0) {
				sum+=i;
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\n총합 : " + sum);
		
		// 교수님 작성
		// 3의 배수 출력 & 합 구하기
		// count=0일 때도 줄간격 띄움
//		for (int i=0; i<=x; i++) {
//			if (i % 3 == 0) {
//				if (count % 5 == 0) {
//					System.out.print("\n");
//				}
//				sum+=i;
//				System.out.print(i + "\t");
//				count++;
//			}
//		}
//		System.out.println("\n총합 : " + sum);
		
	}

}
