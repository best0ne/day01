package variable;



/*
변수
- 데이터를 저장하는 공간
자료형
- int / char / double / float / String
*/
public class TestClass01 {
public static void main(String[] args) {
	/*
	 변수 생성 규칙
	 - 첫 문자는 소문자이며 합성어라면 합성어의 첫 문자는 대문자로 표기
	 - 예시 -> youName
	 - 변수 이름은 의미를 부여해서 만드는게 좋다
	 */
	
	int age = 20;	// 대입연산자 = < --- 같다는 의미 x / 
	//오른쪽의 값을 왼쪽에 있는 변수에 저장한다는 뜻!
	System.out.println("나의 나이는 "+age+"세 입니다");
	
	// 나이가 변하면 하나씩 다시 변경해야 하는 불편함이 있음 ! 
	System.out.println("나의 나이는 20살");
	System.out.println("20살은 좋다");
	System.out.println("20살은 참 좋다");
	// 변수를 활용해 불편함 해소 
//	int age = 21;
	System.out.println("나의 나이는"+age+"살");
	
//	int test = 1.11; 	// 자료형이 맞지 않아 오류 발생
	double weight = 55.2;
	System.out.println("나의 몸무게"+weight+"kg입니다");
	
}
}
