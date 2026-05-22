package studyJava;

public class Java30_loop {

	public static void main(String[] args) {
		// 1~10까지 정수 중에서 홀수의 합계를 구하여 출력하시오
		// 1+3+5+7+9 = 25
		
		//while 문
		System.out.println("while 이용");
		int x=1; //초기치
		int sum=0; //합계
		
		while(x < 10) { //최종치값을 이용하여 조건식을 만든다
			System.out.print(x);
			if(x < 9) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			x+=2; // x = x + 2 증가치
			sum += x; //sum = sum + x
		}
		System.out.print(sum);
		System.out.println();
		
		System.out.println("do -while 이용");
		x=1; //초기치
		sum=0; //합계
		
		do { 
			System.out.print(x);
			if(x < 9) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			x+=2; // x = x + 2 증가치
			sum += x; //sum = sum + x
		}while(x < 10); //조건이 참이면 반복
		System.out.print(sum);
		System.out.println();
		
		System.out.println("for문으로");
		sum=0; //합계
		for(x=1; x<10; x+=2) {
			System.out.print(x);
			if(x < 9) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			sum += x; //sum = sum + x
		}
		System.out.print(sum);
		System.out.println();
	}

}











