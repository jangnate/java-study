package studyJava;

import java.util.Scanner;

public class Java09_operator {

	public static void main(String[] args) {
		//입력화면
		//항공권 가격(원) : 300000
		//숙박비(원) : 150000
		//식비(원) : 80000
		//여행인원수 : 3
		//출력화면
		//1인 여행경비 : 530000 원
		//전체 여행경비 : 1590000 원
		
		int flight; //항공권
		int hotel; //숙박비
		int food; //식비
		int people; //여행인원수
		
		int totalPerson; //1인 여행경비
		int total; //전체 여행 경비
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("항공권 가격(원) : ");
		flight = sc.nextInt();
		System.out.print("숙박비(원) : ");
		hotel = sc.nextInt();
		System.out.print("식비(원) : ");
		food = sc.nextInt();
		System.out.print("여행인원수 : ");
		people = sc.nextInt();

		totalPerson = flight + hotel + food; //1인 경비
		total = totalPerson * people; //전체 경비
		
		System.out.println("1인 여행경비 : "+totalPerson);
		System.out.println("전체 여행경비 : "+total);
		
		sc.close(); //객체반환
		
	}

}
