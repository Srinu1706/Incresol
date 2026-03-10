package Incresol;

public class FreqCout {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,3,3,3,3,};
	
	int count[]= new int [50];
	
	for(int i=0;i<arr.length;i++) {
		count[arr[i]]++;
	}
	
}
}
