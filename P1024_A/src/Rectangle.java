// Shape - Rectangle

public class Rectangle extends Shape {
	int width, height; //가로, 세로
	
	@Override
	void draw() {
		System.out.println("Draw Rectangle");
	}
	
	void getArea() {
		System.out.println("사각형 면적");
	}
	
}
