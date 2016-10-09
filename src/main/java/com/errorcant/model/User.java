package com.errorcant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

/**
 * Created by yel on 10/7/16.
 */
public class User {

  @Id
  private String id;

  @Indexed
  private String name;

  /**
   * how the user sign up.
   *
   */
  private String registry;

  private String token;

  private Date createdDate;

}
