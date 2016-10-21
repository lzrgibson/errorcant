package com.errorcant.dao;

import com.errorcant.model.Errorlet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by yel on 10/21/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorletServiceTest {

  @Autowired
  ErrorletService errorletService;

  @Autowired
  ErrorletRepository errorletRepository;

  @Autowired
  ErrorletLogRepository errorletLogRepository;

  @Test
  public void findById() throws Exception {
    assertNull(errorletService.findById("test - never exist"));

    Errorlet errorletToFind = errorletRepository.save(new Errorlet("test - to find"));
    assertNotNull(errorletService.findById(errorletToFind.getId()));

    errorletRepository.delete(errorletToFind);
  }

  @Test
  public void save() throws Exception {
    Errorlet errorlet = new Errorlet("test - errorlet to save");
    errorlet = errorletService.save(errorlet);
    assertNotNull(errorlet.getId());
    assertNotNull(errorlet.getCreateDate());
    assertNotNull(errorlet.getUpdateDate());

    errorletRepository.delete(errorlet);
  }

  @Test
  public void removeById() throws Exception {
    Errorlet errorlet = new Errorlet("test - errorlet to remove");
    errorlet = errorletService.save(errorlet);
    errorletService.removeById(errorlet.getId());
    errorlet = errorletService.findById(errorlet.getId());
    assertNull(errorlet);

    errorletLogRepository.deleteAll();
  }

}