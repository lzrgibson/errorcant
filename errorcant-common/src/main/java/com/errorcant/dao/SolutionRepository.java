package com.errorcant.dao;

import com.errorcant.model.Solution;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yel on 10/22/16.
 */
public interface SolutionRepository extends MongoRepository<Solution, Long> {
}
