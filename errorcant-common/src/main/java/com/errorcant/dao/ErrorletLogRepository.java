package com.errorcant.dao;

import com.errorcant.model.ErrorletLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yel on 10/21/16.
 */
public interface ErrorletLogRepository extends MongoRepository<ErrorletLog, Long> {
}
