package studyJava;

import java.util.Scanner;

public class Java19_condition {

	public static void main(String[] args) {
		// 점수입력(0-100) : 85
		// 학점 : B
		// 입력하신 점수는 홀수 입니다
		
		int score; //점수
		String result; //학점
		String od; //홀짝
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력(0-100) : ");
		score = sc.nextInt();
		if(score >= 90) {
			result="A";
		}else if(score >=80) {
			result="B";
		}else if(score >= 70) {
			result="C";
		}else if(score >= 60) {
			result="D";
		}else {
			result="F";
		}
		System.out.println("학점 : "+result);
		if(score%2 == 0) {
			od="짝수";
		}else {
			od="홀수";
		}
		System.out.println("입력하신 점수 "+score+"는 "+od+"입니다");
		

	}

}
