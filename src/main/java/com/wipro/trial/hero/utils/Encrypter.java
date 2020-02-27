package com.wipro.trial.hero.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Encrypter {

    public static String encrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
