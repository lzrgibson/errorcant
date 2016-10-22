package com.errorcant.dao;

import com.errorcant.model.Errorlet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yel on 10/4/16.
 */
public interface ErrorletRepository extends MongoRepository<Errorlet, String> {

  Page<Errorlet> findAll(Pageable pageable);
}
