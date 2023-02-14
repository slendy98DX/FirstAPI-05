package it.develhope.FirstAPI05.controllers;

import it.develhope.FirstAPI05.DTO.CarDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @PostMapping("/cars")
    public HttpStatus postCar(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO.toString());
        return HttpStatus.CREATED;
    }

    @GetMapping("/cars")
    public CarDTO getCar(){
        return new CarDTO("1","Fiat",200D);
    }
}
