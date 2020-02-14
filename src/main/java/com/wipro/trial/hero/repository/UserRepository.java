package com.wipro.trial.hero.repository;

import com.wipro.trial.hero.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
