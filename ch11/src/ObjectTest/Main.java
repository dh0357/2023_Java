package ObjectTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1 = new String("Hi");
		String obj2 = new String("Hi");
		
		System.out.println(obj1 == obj2);    // false
		System.out.println(obj1.equals(obj2));   // true
	}

}
