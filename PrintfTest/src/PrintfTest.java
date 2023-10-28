// printf() 사용법

public class PrintfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		double dnum = 3.1456;
		String str = "kim";
		
//		System.out.println(); //출력 후 줄바꿈
//		System.out.print(); //출력 후 줄유지
		
		System.out.printf("num : %d", num); //정수 10진수 출력
		System.out.printf("\n" + "dnum : %.2f", dnum); //소수점 2자리 (3자리에서 반올림)
		System.out.printf("\n" + "str : %10s", str); //문자열 (10자리 확보 - 공백포함)

	}

}
