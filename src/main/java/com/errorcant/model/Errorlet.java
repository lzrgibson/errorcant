package com.errorcant.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 *
 * A errorlet is basic unit of an error to describe and solve.
 *
 * Created by yel on 10/4/16.
 */
public class Errorlet {

  @Id
  private String id;

  private String errorMessage;

  private Environment environment;


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  public String getCreater() {
    return creater;
  }

  public void setCreater(String creater) {
    this.creater = creater;
  }

  private String createDate;

  private String updateDate;

  private String updater;

  private String creater;



  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  private List<Solution> solutions;

  public List<Solution> getSolutions() {
    return solutions;
  }

  public void setSolutions(List<Solution> solutions) {
    this.solutions = solutions;
  }

  public Errorlet(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Errorlet(String errorMessage, List<Solution> solutions) {
    this.errorMessage = errorMessage;
    this.solutions = solutions;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

}
