// Fish -> Animal

public class Fish extends Animal{
	String name;
	
	// Fish(){ } // 기본 생성자 생략 - 자동생성 - 객체생성 가능
	Fish(){ } // 다른 생성자가 있을 때 - 자동생성되지 않음 - 직접 작성해야함
	Fish(String name){
		System.out.println("물고기 이름 : " + name);
	}
	
	@Override
	public void move() {
		System.out.println("Fish Move");
	}

}
