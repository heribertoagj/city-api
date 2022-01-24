package com.dio.heribertoagj.cities.repository;

import com.dio.heribertoagj.cities.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
