package com.dio.heribertoagj.cities.controller;


import com.dio.heribertoagj.cities.entity.Country;
import com.dio.heribertoagj.cities.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {

    CountryService countryService;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return countryService.findAll(page);
    }
}
