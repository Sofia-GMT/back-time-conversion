package org.example.service.impl;

import org.example.models.Country;
import org.example.repository.CountryRepository;
import org.example.service.interfaces.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public void delete(String code) {
        countryRepository.deleteById(code);
    }

    @Override
    public void create(Country country) {
        countryRepository.save(country);
    }
}
