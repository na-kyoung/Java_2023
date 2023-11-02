// 카드모양과 숫자배열에서 5장의 카드를 선택하여 출력하는 프로그램

public class Project2_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list1 = {"Clubs","Diamonds","Hearts","Spades"};
		String[] list2 = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		int count = 0;
		int shape, num;
		
		for(int i=0;i<5;i++) {
			shape = (int)(Math.random()*4); // 0~3
			num = (int)(Math.random()*13); // 0~12
			
			count++;
			System.out.println(count + "번째 카드 : " + list1[shape] + " " + list2[num]);
		}
	}
}
