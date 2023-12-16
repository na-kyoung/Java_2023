// 추상 클래스

public abstract class Shape {
	private int x,y;
	public void move(int x, int y) { // 일반 메서드
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // 추상 메서드

}
