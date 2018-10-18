package com.be.appone.common.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.be.appone.common.repo.CountryRepository;
import com.be.appone.common.repo.RegionRepository;

@Component
public class ModelInit implements CommandLineRunner {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    CountryRepository cegionRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Region> l = java.util.Arrays.asList(new Region(1, "Europe"), new Region(2, "Americas"),
                new Region(3, "Asia"), new Region(4, "Middle East and Africa"));
        regionRepository.saveAll(l);
    }

}
