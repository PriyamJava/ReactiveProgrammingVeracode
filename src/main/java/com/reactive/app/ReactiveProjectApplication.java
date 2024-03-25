package com.reactive.app;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

@SpringBootApplication
public class ReactiveProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveProjectApplication.class, args);
	}
}
