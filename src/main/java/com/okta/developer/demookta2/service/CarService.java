package com.okta.developer.demookta2.service;

import com.okta.developer.demookta2.dto.CarDTO;

import java.util.List;

public interface CarService {

    List<CarDTO> findAll();

    CarDTO add(CarDTO carDTO);
}
