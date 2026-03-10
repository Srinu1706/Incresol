package Incresol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver {
public static void main(String[] args) {
	List<Emplyoee> e= new ArrayList<Emplyoee>();
	e.add(new Emplyoee(1, "Srinivas", "IT", 50000));
    e.add(new Emplyoee(2, "Ravi", "HR", 40000));
    e.add(new Emplyoee(3, "Priya", "It", 60000));
    e.add(new Emplyoee(4, "Priya", "HR", 30000));
    e.add(new Emplyoee(5, "Priya", "IT", 90000));
    e.add(new Emplyoee(6, "Priya", "HR", 40000));
    
    Optional<Emplyoee> highest =e.stream().max(Comparator.comparing(Emplyoee::getSalary));
    highest.ifPresent(emp->
    System.out.println("Highest Salary Employee: "
            + emp.getName() + " - " + emp.getSalary()));
    
	/*
	 * e.forEach(emp -> emp.setSalary(emp.getSalary() * 1.4) );
	 */
	/* e.forEach(System.out::println); */
//    e.stream().collect(Collectors.groupingBy((sal) ->sal.getSalary() )
    // grouping by Dept
//   Map<Double, List<Emplyoee>> result= e.stream().collect(Collectors.groupingBy(Emplyoee::getSalary ));    
//    result.forEach((salary,emplyoees)->{
//    	System.out.println("Salary"+salary);
//    	emplyoees.forEach(emp->{
//    		System.out.println(" "+emp.getName()+" "+" "+emp.getDepartment());
//    	});
//    });
//    System.out.println();
    
Map<String, Long> count=e.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,Collectors.counting()));

count.forEach((dept,total)->{
	System.out.println(dept+" "+total);
});
}
}