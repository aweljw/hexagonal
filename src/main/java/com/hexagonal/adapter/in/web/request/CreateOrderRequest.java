package com.hexagonal.adapter.in.web.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderRequest {
  private String name;
  private String mobile;
}
