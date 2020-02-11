package com.wipro.trial.hero.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Team extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.PERSIST)
    private Set<Hero> heroList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setHeroList(Set<Hero> heroList) {
        this.heroList = heroList;
    }
}
