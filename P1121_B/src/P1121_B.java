// 추상클래스를 부모로 상속받은 자식클래스의 객체 생성 후, 재정의된 추상메서드 호출

public class P1121_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lion 객체 l1 생성 후, move() 실행
		// Fish 객체 f1 생성 후, move() 실행
		
		Lion l1 = new Lion();
		Fish f1 = new Fish();
		Fish f2 = new Fish("니모");
		
		l1.move();
		f1.move();
	}

}
