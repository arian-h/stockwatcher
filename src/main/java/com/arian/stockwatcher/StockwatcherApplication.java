package com.arian.stockwatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ImportResource("classpath*:application-context.xml")
public class StockwatcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockwatcherApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public void logGet() {
		System.out.println("Hello!");
	}

}
