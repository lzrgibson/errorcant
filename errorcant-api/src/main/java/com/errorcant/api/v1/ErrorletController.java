package com.errorcant.api.v1;

import com.errorcant.dao.ErrorletRepository;
import com.errorcant.dao.ErrorletService;
import com.errorcant.model.Errorlet;
import com.errorcant.model.Solution;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.social.SocialAutoConfigurerAdapter;
import org.springframework.boot.json.JsonParser;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yel on 10/20/16.
 */
@RestController
@RequestMapping("/v1")
public class ErrorletController {

  @Autowired
  ErrorletService errorletService;

  @RequestMapping(path = "/errorlet", method = RequestMethod.POST)
  public Errorlet postErrorlet(@RequestBody Errorlet errorlet) {
    return errorletService.save(errorlet);
  }

  @RequestMapping(path = "/solution", method = RequestMethod.POST)
  public Solution postSolution(@RequestBody Solution solution) {
    return errorletService.saveSolution(solution);
  }

}
