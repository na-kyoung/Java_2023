
public class P1024_A {
	public static void main(String[] args) {
		
		// #1. 부모 -> 부모
		Shape s1 = new Shape(); //O
		s1.x = 10; //O
		s1.draw(); //O - Draw Shape
		
		
		// #2. 부모 -> 자식 (자식의 독립 멤버 임의 사용)
		Shape s = new Rectangle(); // 부모의 참조변수로, 자식 가리킴 (upcasting)
		s.x = 100; //O, s => Shape
		s.y = 200; //O, s => Shape
		s.draw(); //O - Draw Rectangle
//		s.getArea(); //X - getArea()는 Rectangle의 멤버
		
		// 2-1. Rectangle의 멤버 임의 사용 (downcasting)
		((Rectangle)s).getArea(); //O - 사각형 면적
		
		// 2-2. Rectangle의 멤버 임의 사용 (downcasting)
		Rectangle rc = (Rectangle)s;
		rc.getArea(); //O - 사각형 면적
		
		
		// #3. 부모 -> 부모 (자식의 독립 멤버 임의 사용) - 권고X
		// 3-1. Rectangle의 멤버 임의 사용
		Shape s2 = new Shape();
//		s2.getArea(); //X
//		((Rectangle)s2).getArea(); //O - 에러는 나지 않으나, 권고사항 아님(class cast exception)
		
		
		// #4. 독립 클래스의 멤버 임의 사용 불가능
//		s2.base = 300; //X
//		((Triangle)s2).base = 300; //X - Triangle은 Shape의 자식 클래스가 아님
		
		
		// #5. 부모 -> 자식 (자식의 독립 멤버 임의 사용)
		// Circle 멤버 임의 사용
		Shape c = new Circle(); // upcasting
		((Circle)c).radius = 10; // downcasting
//		Circle c = (Circle)c;
//		c.radius = 10;
		
		
		// #6. 객체 확인 - Shape c = new Circle();
		if( c instanceof Circle )
			System.out.println("Circle의 객체");
		if( c instanceof Shape )
			System.out.println("Shape의 객체");
	}
}
