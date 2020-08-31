package com.hexagonal.application.model.response;

import lombok.Builder;

public class OrderResponse {
  private Long ord_no;
  private String name;
  private String mobile;

  @Builder(builderClassName = "CreateOrderResponseBuilder", builderMethodName = "createOrderResponseBuilder")
  public OrderResponse(Long ord_no) {
    this.ord_no = ord_no;
  }

  @Builder(builderClassName = "FindOrderResponseBuilder", builderMethodName = "findOrderResponseBuilder")
  public OrderResponse(Long ord_no, String name, String mobile) {
    this.ord_no = ord_no;
    this.name = name;
    this.mobile = mobile;
  }
}
