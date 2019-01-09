package com.okta.developer.demookta2;

import com.okta.developer.demookta2.model.Car;
import com.okta.developer.demookta2.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoOkta2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoOkta2Application.class, args);
	}

//	@Bean
//	ApplicationRunner init(CarRepository repository){
//		return args -> {
//			Stream.of("Honda", "Jaguar","Porsche", "Lamborghini","Suzuku").forEach(demo -> {
//				Car car = new Car();
//				car.setName(demo);
//				repository.save(car);
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}

}

