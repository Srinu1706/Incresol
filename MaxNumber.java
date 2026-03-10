package Incresol;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,2,4,1,5,11);
		Optional<Integer> max =list.stream().max((e1,e2)->e1-e2);
		max.ifPresent(System.out::println);
		
		Optional<Integer> min =list.stream().min((e1,e2)->e1.compareTo(e2));
		min.ifPresent(System.out::println);
	}
	//Takes first element as temporary max Compares 
//	it with next element using comparator
	/*
	 * Keeps the bigger one
	 * Repeats until end
	 * Returns final maximum
	 */
}
