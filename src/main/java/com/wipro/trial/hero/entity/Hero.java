package com.wipro.trial.hero.entity;

import javax.persistence.Entity;

@Entity
public class Hero extends BaseEntity {

    private String name;
    private String superpower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
