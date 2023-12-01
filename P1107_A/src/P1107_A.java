// 인스턴스 필드의 오버라이딩 여부 확인 실습 - X 되지않음

public class P1107_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// #1. 객체 생성
		Animal aa = new Animal();
		Lion bb = new Lion();
		Animal ab = new Lion(); // upcasting
		
		// #2. 인스턴스 필드
		System.out.println(aa.m); //3
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3 - 인스턴스 필드는 오버라이딩 X
		System.out.println(((Lion)ab).m); //4 - downcasting
		
	}

}
