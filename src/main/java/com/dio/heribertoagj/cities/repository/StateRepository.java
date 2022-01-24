package com.dio.heribertoagj.cities.repository;

import com.dio.heribertoagj.cities.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long > {
}
