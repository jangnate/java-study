package studyJava;

import java.util.Scanner;

public class Java38_loop {

	public static void main(String[] args) {
//		======= 가계부 =======
//				종류: 1=수입 2=식비 3=교통 4=쇼핑 5=기타
//				(0 입력 시 종료)
//
//				종류 선택: 1
//				금액 입력(원): 3000000
//				✅ 수입 3000000원 추가
//				현재 잔액: 3000000원
//
//				종류 선택: 2
//				금액 입력(원): 150000
//				🍚 식비 150000원 지출
//				현재 잔액: 2850000원
//
//				종류 선택: 3
//				금액 입력(원): 80000
//				🚌 교통비 80000원 지출
//				현재 잔액: 2770000원
//
//				종류 선택: 4
//				금액 입력(원): 250000
//				🛍️ 쇼핑 250000원 지출
//				현재 잔액: 2520000원
//
//				종류 선택: 0
//				================================
//				       최종 가계부 결산
//				================================
//				총 거래 건수: 4건
//				총   수   입: 3000000원
//				--------------------------------
//				식      비: 150000원
//				교  통  비: 80000원
//				쇼      핑: 250000원
//				기      타: 0원
//				총   지   출: 480000원
//				--------------------------------
//				💰 잔  액: 2520000원
//				================================
		
        Scanner sc = new Scanner(System.in);

        int income = 0;     // 총 수입
        int food = 0;       // 식비
        int transport = 0;  // 교통비
        int shopping = 0;   // 쇼핑
        int etc = 0;        // 기타 지출
        int count = 0;      // 거래 횟수

        System.out.println("======= 가계부 =======");
        System.out.println("종류: 1=수입 2=식비 3=교통 4=쇼핑 5=기타");
        System.out.println("(0 입력 시 종료)");

        while (true) {
            System.out.print("\n종류 선택: ");
            int type = sc.nextInt();

            if (type == 0) break;

            if (type < 1 || type > 5) {
                System.out.println("잘못된 선택입니다.");
                continue;
            }

            System.out.print("금액 입력(원): ");
            int amount = sc.nextInt();
            count++;

            switch (type) {
                case 1:
                    income += amount;
                    System.out.println("✅ 수입 " + amount + "원 추가");
                    break;
                case 2:
                    food += amount;
                    System.out.println("🍚 식비 " + amount + "원 지출");
                    break;
                case 3:
                    transport += amount;
                    System.out.println("🚌 교통비 " + amount + "원 지출");
                    break;
                case 4:
                    shopping += amount;
                    System.out.println("🛍️ 쇼핑 " + amount + "원 지출");
                    break;
                case 5:
                    etc += amount;
                    System.out.println("📌 기타 " + amount + "원 지출");
                    break;
            }

            int totalExpense = food + transport + shopping + etc;
            int balance = income - totalExpense;
            System.out.println("현재 잔액: " + balance + "원");
        }

        int totalExpense = food + transport + shopping + etc;
        int balance = income - totalExpense;

        System.out.println("================================");
        System.out.println("       최종 가계부 결산        ");
        System.out.println("================================");
        System.out.println("총 거래 건수: " + count + "건");
        System.out.println("총   수   입: " + income + "원");
        System.out.println("--------------------------------");
        System.out.println("식      비: " + food + "원");
        System.out.println("교  통  비: " + transport + "원");
        System.out.println("쇼      핑: " + shopping + "원");
        System.out.println("기      타: " + etc + "원");
        System.out.println("총   지   출: " + totalExpense + "원");
        System.out.println("--------------------------------");

        if (balance >= 0) {
            System.out.println("💰 잔  액: " + balance + "원");
        } else {
            System.out.println("⚠️ 적  자: " + Math.abs(balance) + "원");
        }
        System.out.println("================================");
    }

}
