// 추상클래스 상속 & 추상메서드 재정의

public class P1114_B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Animal animal1 = new Animal(); // error - 추상클래스는 객체생성 불가능
		
		// 추상클래스를 상속받은 자식클래스는 객체생성 가능
		Animal animal2 = new Cat(); // upcasting
		animal2.cry(); // 야옹
		
		Animal animal3 = new Dog(); // upcasting
		animal3.cry(); // 멍멍

	}

}
