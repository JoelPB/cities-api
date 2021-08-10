package com.github.JoelPB.citiesapi.repository;

import com.github.JoelPB.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
