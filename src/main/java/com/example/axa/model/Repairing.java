package com.example.axa.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table
public class Repairing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "repairing")
    private Set<Pit> pits = new HashSet();

    private Date repairing_plan_date;

    private boolean repaired;

}
