package studyJava;

import java.util.Scanner;

public class Java35_loop {

	public static void main(String[] args) {
		// 업다운 게임 만들기
		
		// 컴퓨터가 무작위의 1-100 사이의 정수값 숫자를 만든다
		int com = (int)(Math.random()*100)+1;
		
		System.out.println("숫자 맞추기 게임");
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; //카운트 값 저장 변수
		
		for(;;) { //for문으로 무한 반복
			System.out.print("숫자 입력(1-100) : ");
			int num = sc.nextInt(); 
			//메서드 안에서 선언하면 for문 안에 서만 사용하는 지역변수
			if(num < 1 || num > 100) { //음수나 100보다 큰값이 입력되면
				continue; //for문으로 되돌아 가라
			}
			count = count + 1; // 입력 받은 개수 카운트
			if(num == com) { //숫자가 같으면
				System.out.println("정답 입니다");
				System.out.println("시도한 횟수 : "+count + "번 입니다");
				break;
			}else if(num < com) { //숫자가 작으면
				System.out.println("숫자 Up 하세요");
			}else { //숫자가 크면
				System.out.println("숫자 Down 하세요");
			}
		}
	}
}




