package com.example;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
    String home() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		Date today = Calendar.getInstance(Locale.FRANCE).getTime();
        return "<h2>Hello World!</h2> Nous sommes le " + sdf.format(today);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
