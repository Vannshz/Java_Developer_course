package com.practice.Naming_Convention;

import java.time.LocalDateTime;
import java.time.*;
public class LocalDateTimeExample {
	public static void main(String[] args) {
		//Current Date
		LocalDateTime today=LocalDateTime.now();
		System.out.println("Current DataTime is " + today);

		//Current date using Local Date and Local Time
		today=LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println("Current DataTime is " + today);
	}

}
