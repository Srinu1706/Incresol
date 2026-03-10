package Incresol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUppercase {
public static void main(String[] args) {
	
	List<String> l=  Arrays.asList("Amma","nana","akka");
	
	List<String> l1=l.stream().map(L->L.toUpperCase()).collect(Collectors.toList());
	System.out.println(l1);
	
	
	
}
}
