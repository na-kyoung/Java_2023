// 추상클래스를 부모로 상속받은 자식클래스의 객체 생성 후, 재정의된 추상메서드 호출

public class P1121_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Circle 객체 c1 생성 후, draw() 호출
		// Rectangle 객체 r1 생성 후, draw() 호출
		
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		c1.draw();
		r1.draw();

	}

}
