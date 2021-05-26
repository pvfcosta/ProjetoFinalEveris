package com.github.pvfcosta.apicidades;

import com.github.pvfcosta.apicidades.countries.Country;
import com.github.pvfcosta.apicidades.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")

public class CountryResource {

    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }
}
