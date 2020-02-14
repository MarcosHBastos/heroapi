package com.wipro.trial.hero.utils;

import org.springframework.util.DigestUtils;

public class Encrypter {

    public static String encrypt(String password) {
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }
}
