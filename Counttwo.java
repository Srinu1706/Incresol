package Incresol;

public class Counttwo {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=30;i++) {
		int num=i;
		while(num!=0) {
			if(num%10==2) {
				count++;
			}
			num=num/10;
		}
	}
	 System.out.println("Total 2's before 30: " + count);
}
}
