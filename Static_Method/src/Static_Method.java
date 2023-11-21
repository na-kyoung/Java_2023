
public class Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		st_fun();
//		de_fun(); //error
		
		Static_Method sm = new Static_Method();
		sm.de_fun();
//		sm.st_fun(); //O - static 함수 호출 가능 하지만 지양!
		
	}
	static void st_fun() {
		System.out.println("static 함수 호출");
	}
	void de_fun() {
		System.out.println("default 함수 호출");
	}

}
