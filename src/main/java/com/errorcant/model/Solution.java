package com.errorcant.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by yel on 10/8/16.
 */
public class Solution {

  @Id
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<SolutionVariant> getVariants() {
    return variants;
  }

  public void setVariants(List<SolutionVariant> variants) {
    this.variants = variants;
  }

  private List<SolutionVariant> variants;
}
