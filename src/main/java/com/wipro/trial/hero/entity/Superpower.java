package com.wipro.trial.hero.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Superpower extends BaseEntity {

    private String description;

    @ManyToMany(mappedBy = "superpowers")
    private Set<Hero> heroList;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHeroList(Set<Hero> heroList) {
        this.heroList = heroList;
    }
}
