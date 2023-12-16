// Circle -> Shape (abstract)

public class Circle extends Shape{
	private int radius;

	// 추상클래스를 상속받았으면, 반드시 추상메서드를 오버라이딩
	@Override
	public void draw() {
		System.out.println("원 그리기");
		
	}
}
