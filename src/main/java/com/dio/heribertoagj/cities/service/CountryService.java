package com.dio.heribertoagj.cities.service;

import com.dio.heribertoagj.cities.entity.Country;
import com.dio.heribertoagj.cities.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {

    CountryRepository countryRepository;

    public Page<Country> findAll(Pageable page){
        return countryRepository.findAll(page);
    }
}
