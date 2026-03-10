package Incresol;

public class Thread02 implements Runnable{

	public static void main(String[] args) {
		Thread02 t2= new Thread02();
		Thread t=new Thread(t2);
		t.setName("Created a Thread by Runnable Interface ");
		t.start();
		System.out.println(t.activeCount());
		System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("Created a Thrad by Runnabl "+Thread.currentThread().getName());
		
	}

}
