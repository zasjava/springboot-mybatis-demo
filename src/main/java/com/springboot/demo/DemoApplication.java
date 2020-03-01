package com.springboot.demo;

import com.springboot.demo.mapper.CountryMapper;
import com.springboot.demo.model.Country;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.List;

@SpringBootApplication
@MapperScan({"com.springboot.demo.mapper","com.mybatis.mapper"})
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private CountryMapper countryMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Country> countries = countryMapper.selectAll();
		for (Country country : countries) {
			System.out.println(country);
		}
	}
}
