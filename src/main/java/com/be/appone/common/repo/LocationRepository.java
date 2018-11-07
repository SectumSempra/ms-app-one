package com.be.appone.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.appone.common.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
