// 최상위클래스 Object - toString() 메서드 재정의 X

public class B {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}

}
