package com.errorcant.dao;

import com.errorcant.model.Solution;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by yel on 10/22/16.
 */
public interface SolutionRepository extends MongoRepository<Solution, Long> {

  List<Solution> findByErrorletId(String errorletId);
}
