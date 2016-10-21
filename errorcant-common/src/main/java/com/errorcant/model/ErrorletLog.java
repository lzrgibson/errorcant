package com.errorcant.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by yel on 10/21/16.
 */
@Document
public class ErrorletLog  {

  @Id
  private String id;

  @Indexed
  private String errorletId;

  private Errorlet errorlet;

  @CreatedDate
  private Date createDate;

  public ErrorletLog(){

  }

  public ErrorletLog(String errorletId, Errorlet errorlet) {
    this.errorletId = errorletId;
    this.errorlet = errorlet;
  }

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

  public Errorlet getErrorlet() {
    return errorlet;
  }

  public void setErrorlet(Errorlet errorlet) {
    this.errorlet = errorlet;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

}
