package studyJava;

public class Java31_loop {

	public static void main(String[] args) {
		// 1-10까지 정수 중에서 홀수는 +, 짝수는 - 하여 합계를 출력하시오
		// +1-2+3-4+5-6+7-8+9-10 = -5
		// 힌트 정수를 2로 나눈 나머지가 1과 같으면 더하고, 0과 같으면 뺀다

		//for문 이용
		
		int sum=0;
		for(int i=1; i<=10; i++) { // i= 1 2 3 4 5 6 7 8 9 10
			if(i%2 == 1) { //홀수 이면
				System.out.print("+");
				System.out.print(i);
				sum = sum + i;
			}else { //짝수이면
				System.out.print("-");
				System.out.print(i);
				sum = sum - i;
			}
		}
		
		System.out.print("="+sum);
		
		
		

	}

}
