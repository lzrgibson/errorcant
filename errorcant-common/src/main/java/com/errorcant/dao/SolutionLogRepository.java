package com.errorcant.dao;

import com.errorcant.model.Solution;
import com.errorcant.model.SolutionLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yel on 10/22/16.
 */
public interface SolutionLogRepository extends MongoRepository<SolutionLog, Long> {
}
