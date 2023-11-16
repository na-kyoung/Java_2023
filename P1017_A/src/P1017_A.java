// 클래스의 상속

class A { }
class B extends A { }
class C extends B { }
class D extends B { }

public class P1017_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// upcasting (자동)
		A a = new A();
		A a1 = new B(); // 부모의 참조변수(a1)로 자식(B)을 가리킴
		A a2 = new C();
		A a3 = new D();
		
		B b1 = new C();
		B b2 = new D();
		
		// downcasting - error
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
//		
//		C c1 = new A();
//		C c2 = new B();
//		
//		B b1 = new A();
	}

}
