package studyJava;

import java.util.Scanner;

public class Java33_loop {

	public static void main(String[] args) {
		//키보드로 부터 N개의 정수값을 입력받아 값이 0-100 사이의 점수 5개를
		//찾아서 합계를 구하여 출력 하시오
		
		//입력 : -99
		//입력 : 10
		//입력 : 110
		//입력 : 20
		//입력 : 30
		//입력 : 40
		//입력 : 200
		//입력 : 50
		//합계 : 150
		
		//필요한 변수가 머니??
		
		Scanner sc = new Scanner(System.in);
		
		int num; //정수 입력값 저장 변수
		int cnt=0; //개수 저장 변수
		int sum=0; //합계 저장 변수
		
		
		
		while(true) {
			System.out.print("정수만 입력 : ");
			num = sc.nextInt();
			if(num > 0 && num <= 100) {
				sum = sum + num;
				cnt = cnt + 1;
				if(cnt == 5) {
					break;
				}
			}
		} //while
		System.out.println("합계 : "+sum);
	}
}







