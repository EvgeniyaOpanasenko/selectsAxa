package com.example.axa.model.controllers;

import com.example.axa.model.Street;
import com.example.axa.model.service.StreetServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/axa/api")
public class MainController {
    public static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private StreetServiceImpl streetService;

    @RequestMapping(value = "/streetsNoPits", method = RequestMethod.GET)
    public ResponseEntity<List<Street>> streetsNoPits() {
        List<Street> streets = streetService.findStreetNoPits();
        if (streets.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(streets, HttpStatus.OK);
    }

    @RequestMapping(value = "/streets", method = RequestMethod.GET)
    public ResponseEntity<List<Street>> streets() {
        List<Street> streets = streetService.findAll();
        if (streets.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(streets, HttpStatus.OK);
    }


}
