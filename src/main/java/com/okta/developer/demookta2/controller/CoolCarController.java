package com.okta.developer.demookta2.controller;

import com.okta.developer.demookta2.dto.CarDTO;
import com.okta.developer.demookta2.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@Slf4j
public class CoolCarController {

    private final CarService carService;

    public CoolCarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cool-cars")
    @CrossOrigin(origins = "*")//http://localhost:4200
    public Collection<CarDTO> coolCars(){
        return carService.findAll();
    }

//    @PostMapping("/addCars")
//    @ResponseStatus(HttpStatus.CREATED)
//    public CarDTO addCar(@RequestBody CarDTO carDTO){
//        log.info("addCars " + carDTO.getName());
//        return carService.add(carDTO);
//    }

}
