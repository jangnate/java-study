package studyJava;

import java.util.Scanner;

public class Java23_condition {

	public static void main(String[] args) {
		//주차시간을 입력받아서
		//30분 이하 주차 : 무료
		//31-60분 : 1000원
		//61-120분 : 2000원
		//120분 초과시
		// 		기본요금 3000원
		//		이후 초과 1시간마다 1000원 추가
		//		1시간 미만이어도 1시간으로 계산

		Scanner sc = new Scanner(System.in);
		System.out.print("주차시간 입력(분) : ");
		int min = sc.nextInt();
		
		int fee=0;
		
		if(min <= 30) {
			fee = 0;
			System.out.println("주차요금 "+fee+ " 입니다");
		}else if(min <= 60) {
			fee = 1000;
		}else if(min <= 120) {
			fee=2000;
		}else { //120 초과금액
			int extra = (int)Math.ceil((min - 120) / 60.0);
			//Math.ceil() 소수점을 무조건 올림 하는 메서드
			fee = 3000 +(extra * 1000);
		}
		
		if(fee > 0) {
			System.out.println("주차시간 : "+min+ "분");
			System.out.println("주차요금 : "+fee + "원");
		}
		
	}

}







