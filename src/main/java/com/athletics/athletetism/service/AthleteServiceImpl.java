package com.athletics.athletetism.service;

import com.athletics.athletetism.dao.AthleteRepository;
import com.athletics.athletetism.entity.Athlete;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class AthleteServiceImpl implements AthleteService {

    private AthleteRepository athleteRepository;

    public AthleteServiceImpl(AthleteRepository athleteDAO) {
        this.athleteRepository = athleteDAO;
    }

    @Override
    public List<Athlete> findAll() {
        return athleteRepository.findAllByOrderByFirstNameAsc();
    }

    @Override
    public Optional<Athlete> findById(int theId) {
        Optional<Athlete> result=athleteRepository.findById(theId);
        Athlete theAthlete=null;
        if(result.isPresent()){
            theAthlete=result.get();
        }
        else{
            throw new RuntimeException("Did not find employee id - " + theId);
        }
//        return Optional.of(theAthlete);
        return Optional.of(theAthlete);
    }

    @Override
    public Athlete save(Athlete theAthlete) {
        return athleteRepository.save(theAthlete);
    }

    @Override
    public void deleteById(int theId) {
        athleteRepository.deleteById(theId);
    }


}
