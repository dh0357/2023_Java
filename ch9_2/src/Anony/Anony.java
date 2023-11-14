package Anony;

public class Anony {
	int field = 1;
	
	void method(final int arg1, int arg2) {
		final int var1 = 2;
		int var2 = 3;
		
		//arg1 = 4;   // arg1을 final 지정했으므로 값변경 불가능
		  arg2 = 5;
		
		//var1 = 6;
		  var2 = 7;
		  
		  Calculatable c = new Calculatable() {
			 public int sum() {
				 int result = field + arg1 + arg2 + var1 + var2;
				 return result;
			 }
		  };
	}
}
