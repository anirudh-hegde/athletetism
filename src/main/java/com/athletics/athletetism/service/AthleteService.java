package com.athletics.athletetism.service;


import com.athletics.athletetism.entity.Athlete;

import java.util.List;
import java.util.Optional;

public interface AthleteService {
//    void save(Employee theEmployee);

    List<Athlete> findAll();

    Optional<Athlete> findById(int theId);

    Athlete save(Athlete theAthlete);

    void deleteById(int theId);
}
