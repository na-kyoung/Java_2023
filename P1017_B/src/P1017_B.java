// 상속 - 객체의 타입 변환

class A { }
class B extends A { }
class C extends B { }

public class P1017_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. UpCasting - 자동
		A a = new A();
		B b1 = new B();
		A a1 = b1; // upcasting (부모가 자식을 가리킴)
		// A a1 = b1; 
		// A a1 = (A) b1; - 컴파일러 자동 변환

		C c2 = new C();
		B b2 = c2; // upcasting
		// B b2 = c2;
		// B b2 = (B) c2; - 컴파일러 자동 변환
		
		
		// 2. DownCasting - 수동
		A a3 = new A();
//		B b3 = a3; // error
		B b3 = (B) a3; // 수동 타입 변환(downcasting)
		
		A a4 = new B();
//		B b4 = a4; // error
//		C c4 = a4; // error
		B b4 = (B) a4; // 수동 타입 변환(downcasting)
		C c4 = (C) a4; // 수동 타입 변환(downcasting)
		
	}

}
