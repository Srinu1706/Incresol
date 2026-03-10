package Incresol;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public  class Driver_Interface   {
public static void main(String[] args) throws InterruptedException {
//	Addition a = new Addition() {
//		@Override
//		public int add(int a, int b) {
//			return a+b;
//		}
//	};
//	System.out.println(a.add(3, 2));


Addition add=(a,b)->(a+b);
System.out.println(add.add(1, 3));

	LocalDateTime t= LocalDateTime.now();

	DateTimeFormatter formated =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ms");
	String modifedDate=t.format(formated);
	System.out.println(modifedDate);
	



}
}
