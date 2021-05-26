package com.github.pvfcosta.apicidades.repository;

import com.github.pvfcosta.apicidades.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
