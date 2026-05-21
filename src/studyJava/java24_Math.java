package studyJava;

import java.util.Scanner;

public class java24_Math {

	public static void main(String[] args) {
		// 임의의 정수 만들기
		// Math.random() : 0.0보다 크거나 같고 1.0 보다 작은 임의의 double 깂을 반환
		// 로또생성, 업다운 게임, 가위 바위 보 게임, 주사위 게임, 보안인증 번호
		
		// 주사위 번호 1-6까지 있다. 임의의 숫자를 만들어 보시오

		//0.0 <= Math.random() < 1.0
		//1. 각변에 6을 곱한다 
		//2. 각변을 int 형으로 변환한다
		//3. 각변에 1을 더한다
		
		Scanner sc = new Scanner(System.in);
		int me=0;
		int com=0;
		System.out.print("1-6사이 임의 숫자 입력 :");
		me = sc.nextInt();
		if(me<1 || me>6) {
			System.out.println("숫자 입력 오류 입니다");
		}else {
			com = (int)(Math.random()*6)+1;
			if(me > com) {
				System.out.println("니가 이겨서 좋으냐!");
			}else if(me == com) {
				System.out.println("둘이 비겼어!");
			}else {
				System.out.println("니가 졌어. 꿀밤 10대!");
			}
		}
		
		
		
	}

}











