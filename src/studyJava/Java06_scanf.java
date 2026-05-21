package studyJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java06_scanf {

	public static void main(String[] args) {
		//키보드로 부터 데이터를 입력 받는 방법
		//번호입력 : 1111
		//이름입력 : 홍길동
		//국어입력 : 100
		//영어입력 : 100
		//수학입력 : 100
		//번호 이름 국어 영어 수학 총점 평균 학점 합격여부를 출력하시오
		
		//Scanner 클래스
		//키보드로 부터 데이터를 입력받기 위한 클래스
		//System.in에게 키를 읽게 하고 읽은 바이트를 
		//문자,정수,블린,실수,문자열등 다양한 타입으로 변환하여 리턴
		
		Scanner sc = new Scanner(System.in);
		
		int bno;
		String name;
		int kor,eng,mat,tot;
		double ave;
		String grade;
		String result;
		
		System.out.print("번호입력 : ");
		bno = sc.nextInt(); //정수값 입력
		System.out.print("이름입력 : ");
		name = sc.next(); // 문자열 입력
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		tot = kor+eng+mat;
		ave = tot/3.;
		
		if(ave>=90) {
			grade = "A학점";
		}else if(ave>=80) {
			grade="B학점";
		}else {
			grade="C학점";
		}
		
		if(ave>=90) {
			result = "합격";
		}else {
			result="불합격";
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t합격여부");
		System.out.print(bno+"\t");
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(mat+"\t");
		System.out.print(tot+"\t");
		System.out.print(ave+"\t");
		System.out.print(grade+"\t");
		System.out.print(result);
		System.out.println();
		
	}

}
















