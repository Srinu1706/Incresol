package Incresol;

public class Thread04 {

	public static void main(String[] args)  {
		Runnable r = () -> {
			System.out.println(
					"Created a thread via lambda expression with low MIN_PRIORITY " + Thread.currentThread().getName());
		};
		Thread t = new Thread(r);
		t.setName("Lamba");
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();

		Runnable r1 = () -> {
			System.out.println(
					"Created a thread via lambda expression with low MAX_PRIORITY " + Thread.currentThread().getName());
		};
		Thread t1 = new Thread(r1);
		t1.setName("Lamba");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Runnable r2 = () -> {
			System.out.println(
					"Hey Iam Srinivas Bandaru");
		};
		Thread t3 = new Thread(r2);
		t3.setName("Lamba");
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		System.out.println(Thread.activeCount());
		
		
		Thread t4 = new Thread(()->{
			for(int i=0;i<4;i++) {
				System.out.println(i);
			}
		});
		
		t4.start();
		
		try {
			t4.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		Thread t5 = new Thread(()->{
			for(int i=5;i<=10;i++) {
				System.out.println(i);
			}
		});
		t5.start();
		
		
	}
}