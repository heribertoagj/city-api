package com.dio.heribertoagj.cities.service;

import com.dio.heribertoagj.cities.entity.City;
import com.dio.heribertoagj.cities.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityService {
    private CityRepository cityRepository;

    public Page<City> findAll(Pageable page){
        return cityRepository.findAll(page);
    }
}
