	package ch7;

	public class Cargenerate  {
		double speed = 1;
		double position = 0;
		Tire tire;
		
		public  Cargenerate(Tire tire) {
			this.tire= tire;
		}
		
		public void run() {
			tire.roll();
		}
		
		public void SetTire(Tire tire) {
			this.tire =tire;
		}
		
		
		
	}
