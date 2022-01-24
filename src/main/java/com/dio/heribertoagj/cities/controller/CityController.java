package com.dio.heribertoagj.cities.controller;

import com.dio.heribertoagj.cities.entity.City;
import com.dio.heribertoagj.cities.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {

    private CityService cityService;

    @GetMapping
    public Page<City> cities(Pageable page){
        return cityService.findAll(page);
    }
}
