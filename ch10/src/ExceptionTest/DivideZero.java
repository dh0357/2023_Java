package ExceptionTest;

public class DivideZero {
	void method() throw Exception {
		int a = 1;
		int b = 2;
		int c = a / b;   // 무한대가 저장되어 오류 발생
	}
}
