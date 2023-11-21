// 클래스 상속 - instanceof 연산자 실습

class A { }
class B extends A { }
class C extends B { }

public class Class_Instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. A -> A
		A a = new A();
		System.out.println(a instanceof A); //true
		System.out.println(a instanceof B); //false
		System.out.println(a instanceof C); //false
		System.out.println();
		
		// 2. A -> B
		A ab = new B();
		System.out.println(ab instanceof A); //true
		System.out.println(ab instanceof B); //true
		System.out.println(ab instanceof C); //false
		System.out.println();
		
		// 3. A -> C
		A ac = new C();
		System.out.println(ac instanceof A); //true
		System.out.println(ac instanceof B); //true
		System.out.println(ac instanceof C); //true
		System.out.println();
		
		// 4. B -> C
		B bc = new C();
		System.out.println(bc instanceof A); //true
		System.out.println(bc instanceof B); //true
		System.out.println(bc instanceof C); //true

	}

}
