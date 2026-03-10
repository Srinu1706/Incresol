package Incresol;

public class Thread01 extends Thread {
	@Override
	public void run () {
		System.out.println("Thread is created by Extending Thread class"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread01 t= new Thread01();
		t.setName("By extending thread class");
		System.out.println("Main Thread "+Thread.currentThread().getName());
		t.start();
		System.out.println(Thread.activeCount());
		
		
	}

}
