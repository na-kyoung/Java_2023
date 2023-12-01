// static 필드의 오버라이딩 여부 확인 - X 되지 않음
// static 메서드의 오버라이딩 여부 확인 - X 되지 않음
// instance 메서드의 오버라이딩 여부 확인 - O 됨
// 생성자 생성 & 호출

public class P1107_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// #1. 클래스 이름으로 바로 접근
		System.out.println(A.m); //3
		System.out.println(B.m); //4
		
		// #2. 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B(); // upcasting
		
		// #3, 객체 생성을 통한 static 필드
		System.out.println(aa.m); //3
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3 - static 필드는 오버라이딩 X
		System.out.println(((B)ab).m); //4 - downcasting
		
		// #4. static 메서드
		ab.st_print(); // A method - static : 오버라이딩X
		
		// #5. instance 메서드
		ab.ins_print(); // B method - instance : 오버라이딩O
		((A)ab).ins_print(); // B method - instance : 오버라이딩O 
		// ab는 A클래스 이므로, 형변환을 해도 같은 결과가 나옴
		
		
		// #6. Car 생성자
		// Car c1 = new 생성자이름();
		Car c1 = new Car(); // 기본 생성자
		Car c2 = new Car("red"); // color 생성자
		Car c3 = new Car(3000); // price 생성자
	}

}
