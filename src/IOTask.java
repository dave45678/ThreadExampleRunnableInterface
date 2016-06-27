
public class IOTask implements Runnable {

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName() + " started.");

		try {
			Thread.sleep(20); //Sleep for 2 seconds to simulate an IO task 
								// that takes a long time
		} catch (InterruptedException e) {
			// Ignoring it here...
		}
	
		System.out.println(currentThread.getName() + " finished.");
	}

}
