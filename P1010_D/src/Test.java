// static 메서드 - 생성자

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// default 생성자 자동생성 - 다른 생성자 없을 때
		Car c1 = new Car();

		// 생성자가 있어야 함
		Car c2 = new Car("blue");
		Car c3 = new Car(1000, "red");
		
		//static 변수 호출 (클래스명.변수명)
		System.out.println("자동차 생산 수 : " + Car.count);
		
		
		c1.volUp(); // 인스턴스 메소드
		Car.doorOpen(); // static 메소드
		
		// 이름 출력 메소드 : printName()
		// main 함수도 static이기 때문에 printName 함수도 객체 생성 없이
		// 호출하려면 static 이어야 함.
		printName();
		
		// 함수가 static이 아니면
		// 객체 생성해서 사용
		Test t = new Test();
		t.printNumber();

	}
	static void printName(){
		System.out.println("권나경");
	}
	void printNumber() {
		System.out.println("2004404");
	}

}
