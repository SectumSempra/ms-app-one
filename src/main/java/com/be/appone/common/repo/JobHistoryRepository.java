package com.be.appone.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.appone.common.model.JobHistory;
import com.be.appone.common.model.JobHistoryPK;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryPK> {

}
