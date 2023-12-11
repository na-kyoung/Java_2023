// 최상위 클래스 Object - toStirng() 메서드 실습

public class P1114_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A aa = new A();
		System.out.printf("%x \n", aa.hashCode()); // 70dea4e
		
		// 재정의X - 객체 정보(패키지.클래스명@해쉬코드)
		System.out.println(aa); // toString() 생략
		System.out.println(aa.toString());
		
		B bb = new B();
		// 재정의O - 재정의된 함수 수행
		System.out.println(bb); // a:3, b:4
		System.out.println(bb.toString()); // a:3, b:4

	}

}
