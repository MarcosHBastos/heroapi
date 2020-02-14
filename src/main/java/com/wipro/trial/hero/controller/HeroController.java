package com.wipro.trial.hero.controller;

import com.wipro.trial.hero.entity.Hero;
import com.wipro.trial.hero.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping
    public Iterable<Hero> getAll() {
        return heroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Hero> getById(@PathVariable Long id) {
        return heroRepository.findById(id);
    }

    @PostMapping
    public Hero createHero(@RequestBody Hero newHero) {
        return heroRepository.save(newHero);
    }

    @PutMapping
    public Hero updateHero(@RequestBody Hero updHero) {
        return heroRepository.save(updHero);
    }

    @DeleteMapping("/{id}")
    public void deleteHero(@PathVariable Long id) {
        heroRepository.deleteById(id);
    }
}
