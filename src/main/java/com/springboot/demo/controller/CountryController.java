package com.springboot.demo.controller;

import com.springboot.demo.model.Country;
import com.springboot.demo.service.CountryService;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;
    @RequestMapping("/countrys")
    public List<Country> getAll(){
        return countryService.findAll();
    }
}
