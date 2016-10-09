package com.errorcant.model;

import org.springframework.data.annotation.Id;

/**
 * Created by yel on 10/9/16.
 */
public class SolutionVariant {

  @Id
  private String id;

  private String language;

  private String cause;

  private String createDate;

  private String updateDate;

  private String updater;

  private String creater;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

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
}
