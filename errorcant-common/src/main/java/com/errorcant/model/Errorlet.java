package com.errorcant.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 *
 * A errorlet is basic unit of an error to describe and solve.
 *
 * Created by yel on 10/4/16.
 */
@Document
public class Errorlet {

  @Id
  private String id;

  @Indexed
  private String errorMessage;

  @Transient
  private Context context;

  private List<Solution> solutions;

  @CreatedDate
  private Date createDate;

  @LastModifiedDate
  private Date updateDate;

  public Errorlet() {
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
  public String getErrorMessage() {
    return errorMessage;
  }

  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public List<Solution> getSolutions() {
    return solutions;
  }

  public void setSolutions(List<Solution> solutions) {
    this.solutions = solutions;
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

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {
    return "Errorlet{" +
        "id='" + id + '\'' +
        ", errorMessage='" + errorMessage + '\'' +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        '}';
  }

}
