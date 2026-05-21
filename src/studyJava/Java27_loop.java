package studyJava;

public class Java27_loop {

	public static void main(String[] args) {
		// java 반복문(Loop)이란?
		// 반복문이란 특정 코드를 조건이 만족하는 동안 반복해서 실행하는 문장
		// 같은 코드를 여러번 작성하지 않고 효율적으로 처리할 수 있다
		
		// 반복문의 종류
		// for : 반복횟수가 정해져진 경우 사용
		// while : 조건이 참인 동안 반복
		// do-while : 최소 1번은 무조건 실행후 반복
		// 중첩for : for문에 for문
		// break : 반복문 즉시 종료
		// continue : 현재 반복 건너뛰고 다음으로
		
		
		System.out.println(1 + ":"+"JSL인재개발원");
		System.out.println(2 + ":"+"JSL인재개발원");
		System.out.println(3 + ":"+"JSL인재개발원");
		System.out.println(4 + ":"+"JSL인재개발원");
		System.out.println(5 + ":"+"JSL인재개발원");
		
		//위 문장을 while 문으로 작성 해보자
		System.out.println("while 문으로 변경해서 출력");
		
		int cnt=1;
		while(cnt <= 5) { //조건이 참이면 반복{ } 한다
			System.out.println(cnt+":"+"JSL인재개발원");
			cnt = cnt + 1; // 대입문으로 바꾸면 cnt += 1;
		} // 반복의 끝
		
		System.out.println("do- while 문으로 변경해서 출력");
		
		//초기치
		int i=1;
		do {
			System.out.println(i+":"+"JSL인재개발원");
			i++;
		}while(i<=5); //조건식이 참이면 do, 거짓이면 반복을 정지하고 다음 문장 실행
		
		
		System.out.println("for문으로 변경해서 JSL인재개발원으로 출력 해보자");
		
		for(int z=1; z<=5; z++) { 
			//반복실행할 초기치;조건식;증감치 순으로 코딩한다
			//초기값은 1번 실행, 조건식이 참이면 { } 실행, 증가치 실행, 조건식을 반복한다
			//조건식이 거짓이면 { } 블럭을 빠져나가서 다음문장 실행한다
			System.out.println(z+":"+"JSL인재개발원");
			
		}
		
	}

}








