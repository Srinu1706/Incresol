package Incresol;

public class Arrays01 {
public static void main(String[] args) {
	int arr []= {1,2,3,4,5,5,4,3,2,1};
		for(int i=0;i<arr.length;i++) {
			boolean isvistied=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isvistied=true;
					continue;
				}
			}
			if(!isvistied) {
				System.out.println(arr[i]+" ");
			}
		}
}
}
