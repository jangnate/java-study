package studyJava;

import java.util.Scanner;

public class Java25_Math {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		// 가위는 1, 바위는 2, 보는 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1),바위(2),보(3) 입력 :");
		int me = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		int win = me-com;
//		if(win == -1 || win == 2) {
//			System.out.println("Com Win");
//		}else if(win == -2 || win == 1) {
//			System.out.println("You Win");
//		}
		
		switch(win) { //switch() 안에 올 수 있는 값은 변수,수식,정수,문자열
		case -1:
		case 2 : //win에 저장된 값이 -1 또는 2 와 같으면 이라고 해석
			System.out.println("Com Win");
			break;
		case -2:
		case 1 :
			System.out.println("You Win");
			break;
		}
		
		
	}

}
