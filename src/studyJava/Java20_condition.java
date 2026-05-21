package studyJava;

import java.util.Scanner;

public class Java20_condition {

	public static void main(String[] args) {
		// BMI 측정
		// 키입력(m): 1.75
		// 몸무게 입력(kg) : 70
		// BMI지수 : 22.9
		// 판정 : 정상
		
		//bmi = 몸무게 / (키 * 키)
		//bmi < 18.5 ->저체중
		//bmi < 23.0 -> 정상
		//bmi < 25.0 -> 과체중
		//그렇지 않으면 비만
		
		Scanner sc = new Scanner(System.in);
		
		double height; //키
		double weight; //몸무게
		double bmi; //bmi
		String result; //결과
		
		System.out.print("키입력(m): ");
		height = sc.nextDouble();
		System.out.print("몸무게 입력(kg) :");
		weight = sc.nextDouble();
		
		bmi = weight / (height*height);
		
		if(bmi < 18.5) {
			result = "저체중";
		}else if (bmi < 23.0) {
			result = "정상";
		}else if(bmi < 25.0) {
			result = "과체중";
		}else {
			result = "비만";
		}
		
		System.out.println("BMI지수 : "+bmi);
		System.out.println("판정 : "+result);
		

	}

}
