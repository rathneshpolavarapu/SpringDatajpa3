package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.Vaccineservice;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa3Application.class, args);
		
		Vaccineservice service = container.getBean(Vaccineservice.class);
		
//		service.fetchdetails(true, "vaccine").forEach(v->System.out.println(v.getVaccine()));
//		service.fetchVaccinebyPagination(0, 3, true, "vaccine").forEach(v->System.out.println(v.getVaccine()));
        service.fetchVaccinesByPages(2);
}

}