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
}
