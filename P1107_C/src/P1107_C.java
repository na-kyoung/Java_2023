// super 메서드
// 자식클래스의 생성자에는 부모의 기본생성자를 호출하는 super 키워드가 자동 삽입되어 있다.
// 상속 관계에서 자식 생성자를 실행할 때, 제일 먼저 부모의 기본생성자가 실행된다.

public class P1107_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모 기본생성자 -> 자식 기본생성자 순으로 호출
		B b1 = new B(); //A 생성자(default) B 생성자(default) - 부모의 기본생성자 호출
		
		// 부모 기본생성자 -> 자식 생성자(int) 순으로 호출
		B b2 = new B(3); //A 생성자(default) B 생성자(int) - 부모의 기본생성자 호출


	}

}
