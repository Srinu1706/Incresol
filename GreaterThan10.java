package Incresol;

import java.util.Arrays;
import java.util.List;

public class GreaterThan10 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,2,4,1,5,11);
	List<Integer> list1= list.stream().filter(i->i>10).toList();
	System.out.println(list1);
}
}
