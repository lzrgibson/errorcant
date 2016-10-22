package com.errorcant.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Language;
import sun.util.locale.LanguageTag;

import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by yel on 10/22/16.
 */
@Document(collection = "solution")
public class Solution {

  @Id
  private String id;

  @Indexed
  private String errorletId;

  private String language;

  private String causation;

  private String solution;

  private List<String> references;

  @CreatedDate
  private Date createDate;

  @LastModifiedDate
  private Date updateDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getErrorletId() {
    return errorletId;
  }

  public void setErrorletId(String errorletId) {
    this.errorletId = errorletId;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCausation() {
    return causation;
  }

  public void setCausation(String causation) {
    this.causation = causation;
  }

  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public List<String> getReferences() {
    return references;
  }

  public void setReferences(List<String> references) {
    this.references = references;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }
}
