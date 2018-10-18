package com.be.appone.common.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.be.appone.common.repo.CountryRepository;
import com.be.appone.common.repo.RegionRepository;

@Component
public class ModelDataInit implements CommandLineRunner {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    CountryRepository cegionRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Region> l = java.util.Arrays.asList(new Region(1, "Europe"), new Region(2, "Americas"),
                new Region(3, "Asia"), new Region(4, "Middle East and Africa"));
        regionRepository.saveAll(l);

        List<Country> ll = java.util.Arrays.asList(
                new Country("IT","Italy",1),
                new Country("JP","Japan",3),
                new Country("US","United States of America",2),
                new Country("CA","Canada",2),
                new Country("CN","China",3),
                new Country("SG","Singapore",3),
                new Country("ZW","Zimbabwe",4),
                new Country("ZM","Zambia",4),
                new Country("KW","Kuwait",4)

                );
        cegionRepository.saveAll(ll);



    }

}