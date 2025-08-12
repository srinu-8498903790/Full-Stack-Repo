package com.sd;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj01SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj01SchedulingApplication.class, args);
		System.out.println("App started at:: " + newDate());
	}

	private static String newDate() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return now.format(formatter);
	}
}
