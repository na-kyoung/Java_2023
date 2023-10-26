// ScannerTest
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력받음
		System.out.print("이름 : ");
		String name = scanner.next(); // Kim
		
		System.out.print("주소 : ");
		scanner.nextLine(); // 버퍼비우기
		String addr = scanner.nextLine(); // 서울시 마포구
		
		System.out.print("나이 : ");
		int age = scanner.nextInt(); // 33
		
		System.out.print("몸무게 : ");
		double weight = scanner.nextDouble(); // 65.1
		
		// 출력
		System.out.println("name : " + name);
		System.out.println("address : " + addr);
		System.out.println("age : " + age);
		System.out.println("weight : " + weight);

	}

}
