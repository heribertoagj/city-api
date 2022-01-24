package com.dio.heribertoagj.cities.controller;

import com.dio.heribertoagj.cities.entity.State;
import com.dio.heribertoagj.cities.service.StateService;
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
@RequestMapping("/states")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateController {

    StateService stateService;

    @GetMapping
    public Page<State> states(Pageable page){
        return stateService.findAll(page);
    }
}
