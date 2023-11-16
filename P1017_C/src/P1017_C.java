// 상속 - 객체의 타입 변환
// 선언 타입에 따른 차이점

class A {
	int m = 3;
	void abc() {
		System.out.println("A class");
	}
}
class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B class");
	}
}

public class P1017_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. A 타입, A 생성자
		A aa = new A();
		System.out.println(aa.m); //3
		aa.abc(); //A class
		
		// 2. B 타입, B 생성자
		B bb = new B();
		System.out.println(bb.m); //3 - 상속
		System.out.println(bb.n); //4
		bb.abc(); //A class - 상속
		bb.bcd(); //B class
		
		// 3. A 타입, B 생성자
		A ab = new B(); //upcasting
		// A ab = (A) new B();
		System.out.println(ab.m); //3
		ab.abc(); //A class
//		System.out.println(ab.n); //error - 본질은 부모 클래스
//		ab.bcd(); //error - 본질은 부모 클래스

	}

}
