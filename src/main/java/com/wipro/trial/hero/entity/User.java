package com.wipro.trial.hero.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User extends BaseEntity {

    private String email;
    private String password;
    private boolean active;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
