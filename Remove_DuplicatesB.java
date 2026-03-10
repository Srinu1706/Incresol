package Incresol;

public class Remove_DuplicatesB {
public static void main(String[] args) {
	int arr []= {1,2,3,4,5,5,4,3,2,1};
	int size=arr.length;
	Boolean [] b= new Boolean[size];
	for(int i=0;i<arr.length;i++) {
		boolean isduplicate=false;
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				isduplicate=true;
			}
		}
		if(!isduplicate) {
			System.out.println(arr[i]+" ");
		}
	}
} 
}
