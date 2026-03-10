package Incresol;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Even_From_List {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);
	List<Integer> l =list.stream().filter(i->i%2==0).toList();
	


}
}
