// ScannerTest2
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력받음
		System.out.print("이름을 입력하시오 : ");
		//String name = scanner.next(); // 홍길동 (띄어쓰기X)
		String name = scanner.nextLine(); // 홍 길동 (띄어쓰기O)
		
		System.out.print("나이를 입력하시오 : ");
		int age = scanner.nextInt();
		
		// 출력
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");

	}

}
