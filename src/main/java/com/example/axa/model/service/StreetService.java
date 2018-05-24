package com.example.axa.model.service;

import com.example.axa.model.Street;

import java.util.List;

public interface StreetService {

    List<Street> findStreetNoPits();
    List<Street> findAll();
}
