package day01;

public class TestClass02 {
public static void main(String[] args) {
	/*
	 escape 문자
	 - 문자열 안에서 특수한 기능을 수행
	 - \n : enter
	 - \t : tab 
	 - \" : "(큰 따옴표) 하나 표현 
	 - \\ : \(역슬러시) 하나 표현 
	 */
	// ; (쎄미콜론) : 마침표와 비슷한 의미
	// 문장의 마지막에는 꼭 들어간다
	System.out.println("안\n녕\n하\n세\n요");
	System.out.println("1\t1234567\t12345678\t1");
	// 윈도우 탭 크기는  8칸 !  
	//1출력되고 남은 7칸 띄어쓰기 되고 1234567쓰고 남은 1칸 띄어쓰기되는 식 !)
	System.out.println();
	System.out.println("이름\t나이\t주소");
	System.out.println("======================");
	System.out.println("홍길동\t20살\t산골짜기");
	
	// escape 문자는 무조건 ""(큰 따옴표 안에서만 사용 가능 !)
	
	//System.out.println(111 + \n + 222);		// 오류 발생
	System.out.println(111 + "\t" + 222);
	
//	System.out.println("\\"");	// 오류 발생
	System.out.println("\\ \"");
	
	System.out.println("C:\\0.공유자료\\0.오후-과정평과형");
	System.out.println("\"C:\\0.공유자료\\0.오후-과정평과형\"");
	
	
	
	
}
}
