package Incresol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Second_highest {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(18,1,0,2,3,2,4,1,5,11);
	
	
	Optional <Integer> value =list.stream().max(Integer::compare);
	value.ifPresent(System.out::println);
	
list.stream().sorted((e1,e2)->e1-e2).toList().forEach(System.out::print);

list.stream().sorted((e1,e2)->e2-e1).toList().forEach(System.out::println);
	List<Integer> second=list.stream().distinct()
//			.sorted((e1,e2)->e2-e1)
			.sorted(Comparator.reverseOrder())
			.skip(1).limit(1).toList();
	System.out.println(second);
}
}
