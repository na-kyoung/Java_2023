
public class Test {
	public static void main(String[] args) {
		
		A a = new A();
		// default - instance 변수
		System.out.println(a.m); //3
		
		// static - 객체 생성 X (클레스이름.변수명)
		System.out.println(A.n);
	}
}
