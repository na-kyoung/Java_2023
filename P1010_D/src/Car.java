// 클래스 = 필드(성질, 특성) + 메서드(기능)

public class Car {
	String color; //필드
	int price;
	int vol;
	static int count;
	
	// 생성자 오버로딩
	// default 생성자 자동생성 - 다른 생성자 없을 때
	public Car() { count++; } // default 생성자 (자동 생성됨)
	
	// 다른 생성자 - 얘네가 있으면 default 자동 생성 X
	public Car(String option) {
		color = option;
		count++;
		}
	public Car(int price, String opt) {
		count++;
	};
	
	void volUp(){ vol++; } // 인스턴스 메소드 - 객체 생성 필수
	void volDown() { vol--; }

	static void doorOpen() { System.out.println("문열림"); }
}
