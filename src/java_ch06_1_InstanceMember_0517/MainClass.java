package java_ch06_1_InstanceMember_0517;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator(10,20);
		// 8번 라인이 실행되는 순간 메모리(RAM)에 Calculator 객체가 만들어지고 변수가 두개 생성. 
		// cal1 안에 firstNum 10, secondNum 20 생성
		// this : 메모리에 만들어져 있는 객체 내에 있는 변수 지정자 즉, firstNum->10, secondNum->20
		// 파이썬의 self와 비슷한 개념.
				
		int result1 = cal1.add(); // 10 + 20 = 30이 반환		
		System.out.println(result1);
		
//	 ** 인스턴스(instance) 멤버 : instance  ---> 메모리에 만들어진 객체 여기서 firstNum->10, secondNum->20
		// 객체마다 다른 값을 가질 경우 -> 인스턴스 멤버로 
		
		System.out.println(cal1.firstNum); //10
		
		
//   ** 정적(static) 멤버 (상수값(정값들)을 보통 static으로)	
	 // public static
	 // 객체를 선언하지 않고도 선언을 안해도 Class이름을 적고. 하면 자동 생성
		// 객체의 값이 고정되어 있을 경우 -> 정적 멤버로
	
		Calculator.thirdNum = 10;
		cal1.thirdNum = 10;
		
		Calculator.minus(20,10); // 선언하지 않고 가져다 쓸 수 있음.
		
//		TestSingleTone test1 = new TestSingleTone 생성자 만들 수 없음!!
		// 생성자가 private이므로, new 연산자로 객체 선언 불가		
		// 메모리에 객체가 한나만 존재하게 하고 싶을 때.
		// 객체를 여러개 만들어도 같은 값을 반환
		
		TestSingleTone testSinge1 = TestSingleTone.getInstance();		
		TestSingleTone testSinge2 = TestSingleTone.getInstance();		
		
		// Calculator.pi = 30.5; 변경됨
		System.out.println(Calculator.PI); //final로 선언된 상수 불러오기
		
	}

}
