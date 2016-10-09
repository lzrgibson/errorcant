package com.errorcant.model;

import java.util.List;

/**
 * Created by yel on 10/9/16.
 */
public class Environment {

  private List<EnvironmentElement> languages;

  private List<EnvironmentElement> applications;

  public List<EnvironmentElement> getLanguages() {
    return languages;
  }

  public void setLanguages(List<EnvironmentElement> languages) {
    this.languages = languages;
  }

  public List<EnvironmentElement> getApplications() {
    return applications;
  }

  public void setApplications(List<EnvironmentElement> applications) {
    this.applications = applications;
  }

  public List<EnvironmentElement> getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(List<EnvironmentElement> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

  private List<EnvironmentElement> operatingSystems;


}
