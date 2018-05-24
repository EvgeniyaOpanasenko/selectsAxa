package com.example.axa.model.service;

import com.example.axa.model.Street;
import com.example.axa.model.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetRepository streetRepository;


    @Override
    public List<Street> findStreetNoPits() {

        List<Street> streets = streetRepository.findAll();
        List<Street> streetsNoPits = streets.stream().filter(street -> street.getPits().isEmpty()).collect(Collectors.toList());

        return streetsNoPits;

    }

    @Override
    public List<Street> findAll() {

        List<Street> streets = streetRepository.findAll();
        return streets;

    }
}
