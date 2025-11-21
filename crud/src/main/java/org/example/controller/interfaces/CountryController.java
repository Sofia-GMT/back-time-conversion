package org.example.controller.interfaces;

import org.example.models.Country;

import java.util.List;

public interface CountryController {

    List<Country> getAllCountries();
    void createCountry(Country country);
    void deleteCountry(String code);
}
