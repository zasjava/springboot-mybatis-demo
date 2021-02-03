package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.CountryMapper;
import com.springboot.demo.model.Country;
import com.springboot.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryMapper countryMapper;
    @Override
    public List<Country> findAll() {
        return countryMapper.selectAll();
    }
}
