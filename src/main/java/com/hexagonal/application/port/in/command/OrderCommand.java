package com.hexagonal.application.port.in.command;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class OrderCommand {
  private final String name;
  private final String mobile;

  @Builder(builderClassName = "CreateOrderCommandBuilder", builderMethodName = "createOrderCommandBuilder")
  public OrderCommand (@NonNull String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }
}
