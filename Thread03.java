package Incresol;

public class Thread03 {
public static void main(String[] args) {
	
	Runnable r = new Runnable() {
		@Override
		public void run() {
			System.out.println("Thread created Via anonymous class"+Thread.currentThread().getName());
		}
	};
	Thread t = new Thread(r);
	t.setName("anonymous class ");
	t.start();
	System.out.println(Thread.activeCount());
	
}
}
