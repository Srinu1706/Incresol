package Incresol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localDate1 {
public static void main(String[] args) {
	 LocalDateTime now = LocalDateTime.now();
	 
	 DateTimeFormatter format= DateTimeFormatter.ofPattern("MM-yyyy-dd HH:mm:ss");
	 String formatedate=now.format(format);
	 System.out.println(formatedate);
}
}
