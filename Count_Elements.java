package Incresol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Count_Elements {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,2,4,1,5,11);
	long a=list.stream().count();
	System.out.println(a);
	
	
//	LocalDate current=LocalDate.now();
	LocalDateTime current=LocalDateTime.now();
	System.out.println(current);
}
}
