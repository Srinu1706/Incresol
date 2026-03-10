package Incresol;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicates {
	public static void main(String[] args) {
		int arr []= {1,2,3,2,4,1,5};
		List<Integer> list1=Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		System.out.println(list1);
	}


}
