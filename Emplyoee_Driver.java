package Incresol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Emplyoee_Driver {
public static void main(String[] args) {
	List<Emplyoee> list = Arrays.asList(
            new Emplyoee(1, "Ravi", "IT", 60000),
            new Emplyoee(2, "Sita", "HR", 45000),
            new Emplyoee(3, "Arjun", "IT", 75000),
            new Emplyoee(4, "Meena", "Finance", 50000),
            new Emplyoee(5, "Kiran", "IT", 85000),
            new Emplyoee(6, "John", "HR", 55000),
            new Emplyoee(7, "David", "Finance", 65000),
            new Emplyoee(8, "Priya", "IT", 72000),
            new Emplyoee(9, "Rahul", "Finance", 90000),
            new Emplyoee(10, "Anjali", "HR", 48000)
    );
	
	Emplyoee e=list.stream().max(Comparator.comparing(Emplyoee::getSalary)).get();
	System.out.println(e);
	
	/*
	 * Emplyoee emp = list.stream() .sorted((e1, e2) ->
	 * Double.compare(e2.getSalary(), e1.getSalary())) .findFirst() .get();
	 * System.out.println(emp);
	 */ 
	
	//Max sal from each dept
	Map<String, Optional<Emplyoee>> map =list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,
			Collectors.maxBy(Comparator.comparing(Emplyoee::getSalary))
			));
	System.out.print(map);
	
	// Avg sal 
	Map<String, Double> avg=list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,
			Collectors.averagingDouble(Emplyoee::getSalary)
			));
	
	System.out.println(avg);
	
	
	// whose sal greater than 7000
	
	list.stream().filter(sal->sal.getSalary()>70000).forEach(System.out::println);
	// count emp
	Map<String, Long> count=list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,
			Collectors.counting()
			));
	System.out.println(count);
	
	//grouping by
	
	Map<String, List<Emplyoee>> dept=list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment));
	
	System.out.println(dept);
	
	//getEmp by names
	
	list.stream().map(Emplyoee::getName).forEach(System.out::println);
	
	//descending order sal
	
	list.stream().sorted((e1,e2)->Double.compare(e2.getSalary() ,e1.getSalary())).forEach(System.out::println);
}
}
