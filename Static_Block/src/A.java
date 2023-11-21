
class A {
	
	int a;
	static int b;
	
	static {
		b = 5;
		System.out.println("static block 실행");
	}
	
	A(){
		a = 3;
	}

}
