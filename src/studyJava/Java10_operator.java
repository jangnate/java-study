package studyJava;

public class Java10_operator {

	public static void main(String[] args) {
		// 두 변수의 값 교환하기
		int a = 10;  //콜라
		int b = 20; //사이다
		//교환전
		System.out.printf("교환전 a = %d, b= %d\n",a,b);

		int tmp;
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("교환후 a = %d, b= %d\n",a,b);
		
	}

}
