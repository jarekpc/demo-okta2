package com.okta.developer.demookta2.service;

import com.okta.developer.demookta2.dto.CarDTO;
import com.okta.developer.demookta2.model.Car;
import com.okta.developer.demookta2.repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarDTO> findAll() {
        //convert Car to CarDTO
//        return this.carRepository.findAll().stream().map( c -> convertToDto(c)).collect(Collectors.toList());
        return this.carRepository.findAll().stream().map(c -> new CarDTO(c.getName())).collect(Collectors.toList());//bez metody ?
    }

    @Override
    public CarDTO add(CarDTO carDTO) {
       this.carRepository.save(new Car(null,carDTO.getName()));
        //conversia carDTo to Car
        return carDTO;
    }

    private boolean isCool(CarDTO carDTO){
        return !carDTO.getName().equals("Honda");
    }

    //convention from Car to CarDTO
    private CarDTO convertToDto(Car car){
        return new CarDTO(car.getName());
    }
}
