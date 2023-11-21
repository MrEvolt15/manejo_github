package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsoGithubApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UsoGithubApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("primer cambio en la misma rama");
	}

}
