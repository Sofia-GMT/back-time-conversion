package org.example.service.interfaces;

import org.example.models.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();

    void delete(String code);

    void create(Country country);
}
