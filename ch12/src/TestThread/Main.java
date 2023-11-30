package TestThread;

public class Main {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
	// DongTask dong = new DongTask();
	Runnable dong = new DongTask();
	Thread thread = new Thread(dong);
	thread.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Ding");
			try {
				Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();              // 멀티쓰레드를 사용하면 OS동작이 구상한대로 안될수도 있다
		}
	}
		


	}
}