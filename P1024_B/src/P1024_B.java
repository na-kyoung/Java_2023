// 상속의 다형성

public class P1024_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal[] arr = new Animal[]{};
		// Animal arr[] = new Animal[]{};
		Animal[] arr = new Animal[] { new Cat(), new Dog() };
		
		for(Animal a : arr) {
			a.cry(); //야옹, 멍멍 -> 다형성
		}
	}

}
