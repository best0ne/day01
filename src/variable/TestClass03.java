package variable;

public class TestClass03 {
public static void main(String[] args) {
	 // 형 변환
	// - 자료형을 변화시키는 것 
	
	int num = 65;
	System.out.println(num);
	System.out.println((char)num);
						// int 형태의 num을 char 형태로 형변환  
	char ch = 'A',ch3;
	int ch2;
	num = 5;
	ch2 = ch + num;	
	ch3 =(char)(ch + num);
	
	System.out.println(ch2);
	System.out.println(ch3);

	float f1 = (float)1.11;	// 에러 이유 - 자료형 크기 / 해결 - 형변환
	float f2 = 1.11f;
	double dou = 1.11;

//	String name = "홍길동";
//	System.out.println("당신의 이름은 "+name);
	
	// Q. 변수 활용하여 출력하기
	System.out.println();
	
	String name = "김말이";
	int age = 20;
	double h = 173.3;
	int iq = 120;
	char grade = 'B';
	
	System.out.println("이름\t: "+name);
	System.out.println("나이\t: "+age);
	System.out.println("키\t: "+h);
	System.out.println("아이큐\t: "+iq);
	System.out.println("등급\t: "+grade);
	

}
}
