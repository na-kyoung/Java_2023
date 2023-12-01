
public class B extends A {
	B(){
		super(); // 자동 삽입 - 부모 기본생성자 호출
		System.out.println("B 생성자(default)");
//		super(); //error - 메소드의 제일 첫번째에 와야함
	}
	B(int a){
		System.out.println("B 생성자(int)");
	}
}
