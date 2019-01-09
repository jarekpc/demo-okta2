package com.okta.developer.demookta2.repository;

import com.okta.developer.demookta2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController
@CrossOrigin(origins = "*")
public interface CarRepository extends JpaRepository<Car, Long> {
}
