package com.wipro.trial.hero.service;

import com.wipro.trial.hero.entity.Hero;
import com.wipro.trial.hero.repository.HeroRepository;
import com.wipro.trial.hero.repository.SuperpowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Deprecated
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private SuperpowerRepository superpowerRepository;

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
