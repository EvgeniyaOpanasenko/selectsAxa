package com.example.axa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "streets")
public class Street implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(cascade = {CascadeType.ALL}, targetEntity = Pit.class)
    @JoinTable(
            name = "street_pits",
            joinColumns = {@JoinColumn(name = "street_id")},
            inverseJoinColumns = {@JoinColumn(name = "pit_id")}
    )
    private Set<Pit> pits = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pit> getPits() {
        return pits;
    }

    public void setPits(Set<Pit> pits) {
        this.pits = pits;
    }
}
