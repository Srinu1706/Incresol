package Incresol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHIghst {
public static void main(String[] args) {
//	int arr []= {1,2,3,4,5,6};
	List<Integer> l=Arrays.asList(1,2,3,4,5,6,1,2,3,4);
	Optional<Integer> result =l.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	result.ifPresent(System.out::println);
	
}
}
