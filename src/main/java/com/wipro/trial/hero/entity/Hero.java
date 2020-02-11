package com.wipro.trial.hero.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Hero extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_team")
    private Team team;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "hero_superpower",
            joinColumns = @JoinColumn(name = "hero_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "superpower_id", referencedColumnName = "id"))
    private Set<Superpower> superpowers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Set<Superpower> getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(Set<Superpower> superpowers) {
        this.superpowers = superpowers;
    }
}
