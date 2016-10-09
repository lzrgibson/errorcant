package com.errorcant.model;

/**
 * Created by yel on 10/9/16.
 */
public class EnvironmentElement {

  private String name;

  private String version;

  @Override
  public String toString() {
    return "EnvironmentElement{" +
        "name='" + name + '\'' +
        ", version='" + version + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public EnvironmentElement(String name, String version) {

    this.name = name;
    this.version = version;
  }
}
