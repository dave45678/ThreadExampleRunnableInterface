
public class ThreadExampleRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started. ");
		
		Thread t2 = new Thread(new IOTask());
		t2.start();
		
		/** Below block simulates IO operation in Main thread ***/
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
	
		System.out.println(t1.getName() + " starts " + t2.getName());
		
		System.out.println(t1.getName() + " finished. ");
	}

}
