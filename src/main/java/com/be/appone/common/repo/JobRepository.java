package com.be.appone.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.appone.common.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {

}
