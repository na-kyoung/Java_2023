// Dog -> Animal
// 추상클래스를 상속받으면, 반드시 추상메서드 재정의

public class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}
