// Scanner - Buffer Clear

import java.util.Scanner;

public class Scanner_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		
		// Buffer Clear
		scanner.nextLine();
		
		System.out.print("문자열 입력 : ");
		String str = scanner.nextLine();
		
		System.out.print(num + ", " + str);
	}

}
