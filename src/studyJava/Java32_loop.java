package studyJava;

import java.util.Scanner;

public class Java32_loop {

	public static void main(String[] args) {
		// break: 반복문 수행중 break문을 만나면 가장 가까운 반복문을 빠져 나간다
		// continue : 반복문중 continue 문을 만나면 while문은 조건식으로 이동하고
		//				for 문은 증감식으로 이동한다
		
		// 개수 카운트 하는 방법
		
		// 키보드로 부터 무한반복하면서 정수를 입력 받아서 합과 평균을 출력해 보자
		// 단. 입력값이 -99이면 종료한다
		
		// 필요한 변수는 어떤것이 있을까??
		
		int num; //입력받은 정수값 저장 변수
		int tot=0; //입력받은 값이 정수 이면 합을 구하는 변수
		int ave; //평균을 저장하는 변수
		int cnt=0;  //입력받은 정수 개수가 몇개인지 저장하는 변수
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {  //무한반복, do-while(true){}; for(;;) {}
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if(num == -99) {
				break;
			}
			if(num > 0) { //정수이면
				tot = tot + num; //tot += num; 같다
				cnt += 1; //cnt = cnt + 1; 정수 개수 카운트
			}else {//정수가 아니면
				continue; //while 문으로 되돌아 가라
			}
		}
		
		ave = tot / cnt;
		System.out.println("합은 "+tot);
		System.out.println("평균은 "+ave);
		System.out.println("정수 개수는 "+cnt);
		

	}

}







