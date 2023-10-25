// 1~100 사이의 정수중에서 3 또는 4의 배수 합을 구하는 프로그램

public class Project2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배수 판별 : 나머지 연산자 % 이용
		// 2의 배수 : i%2 == 0
		// or -> 논리 연산자 ||
		
		// 1. for문의 i 이용
		int a=0;
		
		for (int i=1; i<101; i++) {
			if ((i%3==0)||(i%4==0)){
				a+=i;
			}
		}
		System.out.println(a);

		// 2. sum 변수 사용
		int sum = 0;
		int i = 1;
		
		for (i=1; i<=100; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				sum += i;
			}
		}
		System.out.println("합 : " + sum);
		
	}

}
