package com.dio.heribertoagj.cities.controller;

import com.dio.heribertoagj.cities.service.DistanceService;
import com.dio.heribertoagj.cities.utils.EarthRadius;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceController {

    private DistanceService distanceService;

    @GetMapping("/by-points")
    public Double byPoints( @RequestParam(name = "from") final Long city1,
                            @RequestParam(name = "to") final Long city2 ){
        return (double) distanceService.distanceByPointsInMiles(city1, city2);
    }

    @GetMapping ("/by-cube")
    public Double byCube ( @RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2 ){
        return (double) distanceService.distanceByCubeInMeters(city1, city2);
    }

    @GetMapping("/by-math")
    public Double byMath(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        return (double) distanceService.distanceUsingMath(city1,city2, EarthRadius.KILOMETERS);
    }
}
