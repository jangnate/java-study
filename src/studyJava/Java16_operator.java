package studyJava;

import java.util.Scanner;

public class Java16_operator {

	public static void main(String[] args) {
		// 무료배송 여부 처리
		
		//주문금액(원) : 20000
		//회원여부(1-회원, 0-비회원): 1
		//무료배송 여부 : true
		
		//조건 : 주문금액이 3만원 이상 또는 회원이면 무료배송한다

		Scanner sc = new Scanner(System.in);
		
		int price; //주문금액
		int member; //회원여부
		boolean result; //무료배송 여부
		
		System.out.print("주문금액(원) : ");
		price = sc.nextInt();
		System.out.print("회원여부(1-회원, 0-비회원): ");
		member = sc.nextInt();
		
		//조건문 처리
		result = price >= 30000 || member == 1;
		//출력
		if(result) {
			System.out.println("무료배송 가능");
		}else {
			System.out.println("상품구매 또는 회원 가입 하세요");
		}
		
	}

}








