package com.errorcant.dao;

import com.errorcant.model.Errorlet;
import com.errorcant.model.ErrorletLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by yel on 10/8/16.
 */
@Service
public class ErrorletService {

  private static final Logger logger = LoggerFactory.getLogger(ErrorletService.class);

  @Autowired
  private ErrorletRepository errorletRepository;

  @Autowired
  private ErrorletLogRepository errorletLogRepository;

  @Autowired
  private MongoTemplate mongoTemplate;

  public Errorlet findById(String id) {
    return errorletRepository.findOne(id);
  }

  public Errorlet save(Errorlet errorlet) {
    return errorletRepository.save(errorlet);
  }

  public void removeById(String id) {
    Errorlet errorletToDelete = errorletRepository.findOne(id);
    ErrorletLog errorletLog = new ErrorletLog(errorletToDelete.getId(), errorletToDelete);
    errorletLogRepository.insert(errorletLog);
    errorletRepository.delete(id);
  }

}
