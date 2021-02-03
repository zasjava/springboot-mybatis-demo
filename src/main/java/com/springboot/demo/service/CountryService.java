package com.springboot.demo.service;

import com.springboot.demo.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();
}
