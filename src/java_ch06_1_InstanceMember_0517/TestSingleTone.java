package java_ch06_1_InstanceMember_0517;

public class TestSingleTone {
	
//	Calculator cal1 = new Calculator();
//	Calculator cal2 = new Calculator();
//	Calculator cal3 = new Calculator();
	
	// 싱글톤 - 단 하나만 생성.
	private static TestSingleTone single1 = new TestSingleTone();
	
	// 생성자를 만들 수 X private 감춰놨기 때문에
	// 다른 클래스에서 사용할 수 없음 -> 전체 프로그램에서 단 하나의 객체만 만들기 위해 
	private TestSingleTone() {
			
	}
	
	public static TestSingleTone getInstance() {
		return single1; // single1을 반환하는 메소드를 만듦.
	}
	
}
