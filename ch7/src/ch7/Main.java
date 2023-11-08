package ch7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tire tire = new HankookTire();
		Cargenerate sc = new Cargenerate(tire);
		sc.run();
		tire = new KumhoTire();
		sc.SetTire(tire);
		sc.run();
		} 
}