package com.wipro.trial.hero.repository;

import com.wipro.trial.hero.entity.Hero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HeroRepository extends CrudRepository<Hero, Long> {

}
