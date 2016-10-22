package com.errorcant.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by yel on 10/22/16.
 */
@Document(collection = "solution_log")
public class SolutionLog {

  @Id
  private String id;

  private Solution solution;

  @CreatedDate
  private Date createDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Solution getSolution() {
    return solution;
  }

  public void setSolution(Solution solution) {
    this.solution = solution;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
