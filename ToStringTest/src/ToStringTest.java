// Arrays.toString(배열명) - 배열 전체 출력

import java.util.Arrays;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"kim","lee","hong"};
		int[] num = {1,2,3,4,5};
		
//		System.out.println(str); //error
		System.out.println(Arrays.toString(str));
		
//		System.out.println(num); //error
		System.out.println(Arrays.toString(num));

	}

}
