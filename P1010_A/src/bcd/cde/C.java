package bcd.cde;

import abc.bcd.A; // A 클래스 임포트
//import abc.bcd.B;

class C {
	// 다른 패키지, public 클래스 - O
	A a = new A();
	
	// 다른 패키지, default 클래스 - X
//	B b = new B();

}
