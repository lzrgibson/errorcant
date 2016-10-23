package com.errorcant.controller;

import com.errorcant.dao.ErrorletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yel on 10/6/16.
 */
@Controller
public class MainController {

  @Autowired
  ErrorletService errorletService;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String home(Model model) {
    model.addAttribute("errorlets", errorletService.findPage(0, 20));
    return "index";
  }

  @RequestMapping(path = "/errorlet/{errorletId}")
  public String errorlet(Model model, @PathVariable String errorletId) {
    model.addAttribute("errorlet", errorletService.findByIdWithSolutions(errorletId));
    return "errorlet";
  }

}
