package studyJava;

import java.util.Scanner;

public class Java36_loop {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아
		// 로그인 시도횟수가 3번 틀리면 "로그인 실패! 계정이 잠금처리 되었습니다" 출력 하시오
		
		//로그인(시도 1/3)
		//아이디 : hong
		//비밀번호: 000
		//로그인 실패! 남은 횟수 : 2회
		//로그인(시도 2/3)
		//아이디 : hong
		//비밀번호: 000
		//로그인 실패! 남은 횟수 : 1회
		//로그인(시도 3/3)
		//아이디 : hong
		//비밀번호: 000
		//로그인 실패! 남은 횟수 : 0회
		//로그인 실패! 계정이 잠금처리 되었습니다

		String sid="hong";
		String spw="1234";
		
		int maxTry = 3; //최대 시도횟수
		int tryCount = 0; //시도횟수 저장값
		boolean isLogin = false; //로그인 성공 여부 처리
		
		Scanner sc = new Scanner(System.in);
		
		do {
			tryCount++;//시도 횟수 증가
			System.out.println("로그인(시도 "+tryCount+ "/" +maxTry+")");
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			if(id.equals(sid) && pw.equals(spw)) {
				isLogin = true;
			}else {
				System.out.println("로그인 실패! 남은 횟수 : "+(maxTry - tryCount));
			}
		}while(!isLogin && tryCount < maxTry); //조건이 참일때 반복 실행한다. 제발~~ 참일때

		if(isLogin) {
			System.out.println("로그인 성공! 환영합니다 🧡");
		}else {
			System.out.println("계정이 잠금 처리되었습니다. 👀");
		}
	}

}






