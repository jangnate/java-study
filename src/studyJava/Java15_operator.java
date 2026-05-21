package studyJava;

import java.util.Scanner;

public class Java15_operator {

	public static void main(String[] args) {
		// 입력받은 값이 80-90사이 이거나 7의 배수이면 true 아니면 false 출력
		
		int seven; //숫자 입력 변수
		Scanner sc = new Scanner(System.in); //import 단축키 ctrl+shift + O(알파벳)
		
		System.out.print("정수 입력 : ");
		seven = sc.nextInt();
		
		//boolean result = (seven >= 80 && seven <= 90) || seven%7 == 0;
		boolean b1 = seven>=80 && seven <=90;
		boolean b2 = seven%7 ==0;
		boolean result = b1 || b2;
		
		if(result) {
			System.out.println("true 입니다");
		}else {
			System.out.println("false 입니다");
		}
	}

}







