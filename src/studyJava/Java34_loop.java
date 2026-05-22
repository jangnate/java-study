package studyJava;

import java.util.Scanner;

public class Java34_loop {

	public static void main(String[] args) {
		
		int i=0;
		do {
			System.out.println(i++); //후위 연산자는 실행후 증가 0출력후 증가
		}while(i == 3); //조건이 참일때 반복한다
		
		//키보드로 부터 점수(1~100)을 입력받아서 최대점수, 최소점수를 구하여 출력하시오
		//단. 입력되는 점수가 -99이면 출력후 종료한다
		//입력예시
		//점수입력 : 10 5 60 41 78 92 50 -99
		//최대점수 : 92
		//최소점수 : 5
		
		//필요한 변수
		
		int num=0;
		int max=Integer.MIN_VALUE; //최저점
		int min=Integer.MAX_VALUE; //최고점
		
		//힌트 : 입력한 값이 최대값 보다 크면 max=num, 입력한 값이 최소값 보다 작으면 min = num;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수 입력");
			num = sc.nextInt(); //점수입력
			if(num == -99) {
				//만약에 입력받은 값이 -99 이면 
				break; //while 문을 탈출 한다
			}
			if(num > max) {
				//만약에 입력받은 값이 최대값 보다 크면
				max = num;
				//최대값 변수에 입력받은 값 저장
			}else if(num < min) {
				//만약에 입력받은 값이 최소값 보다 작으면
				min = num;
				//최소값 변수에 입력받은 값 저장
			}
		}
		System.out.println("최대값 : "+max); //-99가 입력이 되면 반복문을 빠져나와 출력한다
		System.out.println("최소값 : "+min);
	}
}










