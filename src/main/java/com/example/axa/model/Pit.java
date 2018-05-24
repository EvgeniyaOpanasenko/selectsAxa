package com.example.axa.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "pits")
public class Pit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany(mappedBy = "pits", cascade = {CascadeType.ALL}, targetEntity = Street.class)
    private Set<Street> streets = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Repairing.class)
    @JoinColumn(name = "street_id")
    private Repairing repairing;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Street> getStreets() {
        return streets;
    }

    public void setStreets(Set<Street> streets) {
        this.streets = streets;
    }

    public Repairing getRepairing() {
        return repairing;
    }

    public void setRepairing(Repairing repairing) {
        this.repairing = repairing;
    }
}
