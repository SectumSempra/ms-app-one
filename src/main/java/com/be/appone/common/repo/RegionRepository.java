package com.be.appone.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.appone.common.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
