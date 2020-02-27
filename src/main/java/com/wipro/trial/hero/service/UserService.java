package com.wipro.trial.hero.service;

import com.wipro.trial.hero.entity.User;
import com.wipro.trial.hero.repository.UserRepository;
import com.wipro.trial.hero.utils.Encrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getActives() {
        return getByCondition(true);
    }

    public List<User> getInactives() {
        return getByCondition(false);
    }

    private List<User> getByCondition(boolean isActive) {
        Iterable<User> allUsers = userRepository.findAll();
        List<User> actives = new ArrayList<>();
        List<User> inactives = new ArrayList<>();

        for (User user : allUsers)
            if (user.isActive()) {
                actives.add(user);
            } else {
                inactives.add(user);
            }
        return isActive ? actives : inactives;
    }

    public User createUser(User user) {
        user.setPassword(Encrypter.encrypt(user.getPassword()));
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        user.setPassword(Encrypter.encrypt(user.getPassword()));
        return userRepository.save(user);
    }

    private User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getByUsername(username);
        if(user != null) {
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
