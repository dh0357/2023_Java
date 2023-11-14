package Anony;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
		Parent p = new Parent();
		
		m.TestMethod(new Parent);
	}  
	
	void TestMethod(Parent p) {
		p.method();
	}
	
	void method2() {
//		class Child2 extends Parent{
//			void method() {
//				System.out.println("I am child")
//				
//			}
//		}
		
		
	}

}
