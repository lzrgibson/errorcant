package com.errorcant.model;

import java.util.List;

/**
 * Created by yel on 10/9/16.
 */
public class Context {

  private List<ContextElement> computerLanguages;

  private List<ContextElement> applications;

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
