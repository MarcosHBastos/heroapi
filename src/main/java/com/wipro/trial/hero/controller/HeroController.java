package com.wipro.trial.hero.controller;

import com.wipro.trial.hero.entity.Hero;
import com.wipro.trial.hero.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping
    public Iterable<Hero> getAll() {
        return heroService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Hero> getById(@PathVariable Long id) {
        return heroService.getById(id);
    }

    @PostMapping
    public Hero createHero(@RequestBody Hero newHero) {
        return heroService.createHero(newHero);
    }

    @PutMapping
    public Hero updateHero(@RequestBody Hero updHero) {
        return heroService.updateHero(updHero);
    }

    @DeleteMapping("/{id}")
    public void deleteHero(@PathVariable Long id) {
        heroService.deleteHero(id);
    }
}
