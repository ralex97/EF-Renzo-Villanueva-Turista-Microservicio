package com.idat.EC4TuristaMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Ec4TuristaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec4TuristaMicroservicioApplication.class, args);
	}

}
