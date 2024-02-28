package com.athletics.athletetism.rest;

import com.athletics.athletetism.entity.Athlete;
import com.athletics.athletetism.service.AthleteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@Controller
@RequestMapping("/athletes")
public class AthleteRestController {

    private AthleteService athleteService;

    public AthleteRestController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping("/list")
    public String listAthletes(Model theModel) {
        List<Athlete> theAthletes = athleteService.findAll();
        theModel.addAttribute("athletes", theAthletes);
        return "athletes/list-athletes";

    }

    @GetMapping("/showFormToAdd")
    public String showFormToAdd(Model theModel) {
        theModel.addAttribute("athlete", new Athlete());
        return "athletes/athlete-form";
    }

    @GetMapping("/showFormToUpdate")
    public String showFormToUpdate(@RequestParam("athleteId") int theId, Model theModel) {
        Optional<Athlete> theAthlete = athleteService.findById(theId);
        theModel.addAttribute("athlete", theAthlete);
        return "athletes/athlete-form";
    }

    @GetMapping("/deleteAthlete")
    public String deleteAthlete(@RequestParam("athleteId") int theId) {
        athleteService.deleteById(theId);
        return "redirect:/athletes/list";
    }

    @PostMapping("/save")
    public String saveAthlete(@ModelAttribute("athlete") Athlete theAthlete) {
        athleteService.save(theAthlete);
        return "redirect:/athletes/list";
    }

}