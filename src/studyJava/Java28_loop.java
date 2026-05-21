package studyJava;

public class Java28_loop {

	public static void main(String[] args) {

		// 프로그램 들여쓰기 재 정렬 단축키 : ctrl + shift + F

		// 문제 : 1-10까지 정수의 합계를 구하여 출력하시오
		// 1+2+3+4+5+6+7+8+9+10 = 55

		// 생각-> 변수가 무엇이 필요할까???

		System.out.println("while 문을 이용한 1-10 까지 합계 구하기");

		int x = 1; // 1 2 3 ...10을 만들어서 저장하는 변수. 반복실행 초기값
		int sum = 0; // 1+2=3, 3+3=6..... 합계를 저장할 변수

		while (x <= 10) {
			// 조건식이 참이면 { } 반복 실행, 거짓이면 while() 탈출
			// 보통 조건식은 최종값 가지고 만든다
			System.out.print(x);
			sum = sum + x; // sum1 += x //증가되는 숫자를 계속 누적한다
			x++; // x=x+1; x+=1; 와 같다 1 2 3 4.... //반복실행 증가치
			if (x <= 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);

		// 위 프로그램을 do-while 바꿔서 개발 해 보자
		// 문제 : 1-10까지 정수의 합계를 구하여 출력하시오
		// 1+2+3+4+5+6+7+8+9+10 = 55

		System.out.println();
		System.out.println("do-while문으로 변경해서 출력 해 보자");

		int y = 1; // 반복 실행할 초기 값
		int hap = 0;
		do {
			System.out.print(y);
			if (y < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			hap += y; // sum = sum + y;
			y++; // 반복실행 증가치
		} while (y <= 10); // 반복실행할 조건식은 최종값 가지고 만든다, 조건식이 참이면 do 실행
		System.out.print(hap);
		System.out.println();
		
		System.out.println("for 문으로 합계 계산을 바꿔보자");
		
		int tot=0;  //합계저장 변수, 전역변수
		for(int i=1; i<=10; i++) { //초기값; 조건식; 증가치
			System.out.print(i);
			if(i < 10) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			tot = tot + i; //반복되는 숫자를 tot에 누적을 시킨다 tot += i; 같다
		}
		System.out.print(tot); //합계는 한번만 출력 해야 되니깐 for() 밖에 코딩
		
	}
}
















