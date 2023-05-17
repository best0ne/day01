package day01;

public class TestClass03 {
public static void main(String[] args) {
	
	// 연산
	
	System.out.println(100+100);
	System.out.println(100+100.123);
	System.out.println("백"+100);
	System.out.println("백"+100.123);
	System.out.println("백"+100+200); 
	// 문자와 숫자의 연산시 "백"과 100을 더하면 우선순위로 "백100"이라는 문자로 되어버리는 것 !
	//"백100"에 200을 더하면 최종적으로 "백100200"으로 나타나는 것
	System.out.println(100+200+"백");
	System.out.println("백"+(100+200)); // 괄호를 활용해 수연산 우선 계산됨
	
	//문자연산
	System.out.println("안녕"+"하세요");
	System.out.println("100"+500+300);
	
	System.out.println();
	//Q1. 출력하기	/ 조건 : 숫자들은 큰 따옴표 없이 숫자로 사용하기 !  
	
	System.out.println("=======================================");
	System.out.println("이름\t나이\t전화번호\t\t회비");
	System.out.println("=======================5===============");
	System.out.println("홍길동\t"+"\""+15+"\"\t"+3672+"-"+1234+"\t"+"\\"+20000);
	System.out.println("고길동\t"+"\""+15+"\"\t"+2238+"-"+1234+"\t"+"\\"+30000);
	System.out.println("김말이\t"+"\""+15+"\"\t"+1234+"-"+1234+"\t"+"\\"+50000);
	System.out.println("---------------------------------------");
	System.out.println("총합계\t\t\t\t"+"\\"+100000);
	System.out.println("---------------------------------------");
	
	
	
}
}
