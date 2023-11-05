
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		A a2 = new A();
		
		a1.m = 5;
		a2.m = 6;
		
		// default - 객체를 여러 개 만들면 객체마다 변수가 구분됨
		System.out.println(a1.m); //5
		System.out.println(a2.m); //6
		
		a1.n = 7;
		a2.n = 8;
		
		// static - 객체를 여러 개 만들어도 변수가 하나로 공유됨
		System.out.println(a1.n); //8
		System.out.println(a2.n); //8
		
		// static - 객체 생성 없이도 접근 가능
		A.n = 9;
		
		// a1.n = a2.n = A.n
		System.out.println(a1.n); //9
		System.out.println(a2.n); //9

	}

}
