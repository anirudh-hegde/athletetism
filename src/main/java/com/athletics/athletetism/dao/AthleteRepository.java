package com.athletics.athletetism.dao;

import com.athletics.athletetism.entity.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource(path = "athletes")
public interface AthleteRepository extends JpaRepository<Athlete, Integer> {
    public  List<Athlete> findAllByOrderByFirstNameAsc();
}
