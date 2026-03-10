package Incresol;

public class Sani extends Thread {
@Override
public void run() {
	for(int i=0;i<10;i++) {
		System.out.println(i);
	}
	
}
	public static void main(String[] args) throws InterruptedException {
		Sani s = new Sani();
		s.start();
		s.join();
		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
	}

}
