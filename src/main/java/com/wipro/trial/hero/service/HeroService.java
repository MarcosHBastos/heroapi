package com.wipro.trial.hero.service;

import com.wipro.trial.hero.entity.Hero;
import com.wipro.trial.hero.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public Iterable<Hero> getAll() {
        return heroRepository.findAll();
    }

    public Optional<Hero> getById(Long id) {
        return heroRepository.findById(id);
    }

    public Hero createHero(Hero newHero) {
        return heroRepository.save(newHero);
    }

    public Hero updateHero(Hero updHero) {
        return heroRepository.save(updHero);
    }

    public void deleteHero(Long id) {
        heroRepository.deleteById(id);
    }
}
