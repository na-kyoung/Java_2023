// Rectangle -> Shape (abstract)

public class Rectangle extends Shape {
	private int width, height;

	// 추상클래스를 상속받았으면, 반드시 추상메서드를 오버라이딩
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
}
