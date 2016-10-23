package com.errorcant.model;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by yel on 10/9/16.
 */
public class Context {

  @Field(value = "computer_languages")
  private List<ContextElement> computerLanguages;

  private List<ContextElement> applications;

  @Field(value = "operating_systems")
  private List<ContextElement> operatingSystems;

  public Context() {

  }

  public List<ContextElement> getComputerLanguages() {
    return computerLanguages;
  }

  public void setComputerLanguages(List<ContextElement> computerLanguages) {
    this.computerLanguages = computerLanguages;
  }

  public List<ContextElement> getApplications() {
    return applications;
  }

  public void setApplications(List<ContextElement> applications) {
    this.applications = applications;
  }

  public List<ContextElement> getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(List<ContextElement> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

}
