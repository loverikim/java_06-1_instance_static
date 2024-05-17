package java_ch06_1_InstanceMember_0517;

public class Calculator {
	
	// 멤버변수, 필드 선언 
	int firstNum;	// 인스턴스 멤버
	int secondNum;	// 인스턴스 멤버 
	
	static int thirdNum; // 정적 멤버 
	
	static final double PI= 3.141592;//final로 선언된 객체는 수정해서 쓸수 없음.
	// 한번 선언될 때 초기화되면 그 값은 변경불가 -> final로 선언.
	// final로 선언할때는 pi를 대문자로 표기.
	static final double SALERATE = 0.7; // 상수 선언!
	
	
	// 생성자를 통한 초기화
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public int add() {
		return this.firstNum + this.secondNum;
	}
	
//	public static int minus() {
//		return firstNum - secondNum;
//	클래스에 고정된 멤모로 객체를 생성하지 않고 사용할 수 있는 필드와 메소드.
	public static int minus(int firstNum, int secondNum) {
		return firstNum - secondNum;
		
	}
	
}
