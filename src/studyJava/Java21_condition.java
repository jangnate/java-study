package studyJava;

import java.util.Scanner;

public class Java21_condition {

	public static void main(String[] args) {
		// 정수 2개을 입력받아서 큰값, 작은값을 출력 하시오
		// 입력 : 90 70
		// Max : 90, Min : 70
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int max,mid,min;
		
		System.out.print("정수 2개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		System.out.println("Max : "+max+", Min : "+min);
		
		// 정수 3개의 입력받아 아래와 같이 출력 하시오
		// 정수입력 : 7 9 5
		// Max : 9, Mid : 7, Min : 5
		System.out.print("정수 3개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		//최대값 구하기
		if(a>=b && a >= c) {
			max = a;
		}else if(b >= a && b >= c) {
			max = b;
		}else {
			max = c;
		}
		//최소값 구하기
		if(a <= b && a <= c) {
			min = a;
		}else if(b <= a && b <=c) {
			min = b;
		}else {
			min = c;
		}
		//중간값 구하기
		if((a >= b && a <= c) || (a >=c && a <= b)) {
			mid = a;
		}else if ((b >= a && b <=c) || (b >= c && b <= a)) {
			mid = b;
		}else {
			mid = c;
		}
		System.out.println("Max="+max+", Mid="+mid+", Min="+min);
		
		//최대값
		if(a>b) {
			max = (a > c) ? a : c;
		}else {
			max = (b > c) ? b : c;
		}
		
		//최소값
		if(a<b) {
			min = (a < c) ? a : c;
		}else {
			min = (b < c) ? b : c;
		}
		
		//중간값
		mid = a + b + c - max -min;
		
		System.out.println("Max="+max+", Mid="+mid+", Min="+min);
		
		
	}

}
