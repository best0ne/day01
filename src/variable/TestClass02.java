package variable;

public class TestClass02 {
public static void main(String[] args) {
	
	char ch = 'A';
	int num = 123;
	System.out.println("연산 전 ch :"+ch);
	System.out.println("연산 전 num :"+num);
	ch = 'B';
	num = num +123;
	System.out.println("연산 후 ch :"+ch);
	System.out.println("연산 후 num :"+num);
	
	
	// 문자 하나와 숫자는 연산 가능 ! 
	ch = 'a';
	num = 5;
	System.out.println("ch+num ->" + (ch + num));
								// 아스키코드 참고 	
}
}
