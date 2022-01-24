package com.dio.heribertoagj.cities.service;

import com.dio.heribertoagj.cities.entity.State;
import com.dio.heribertoagj.cities.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateService {

    StateRepository stateRepository;

    public Page<State> findAll(Pageable page){
        return stateRepository.findAll(page);
    }
}
