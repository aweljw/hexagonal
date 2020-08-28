package com.hexagonal.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.util.Assert;

@Getter
public class Order {
  private Long id;
  private String name;
  private String mobile;

  @Builder(builderClassName = "CreateOrderBuilder", builderMethodName = "createOrderBuilder")
  public Order(String name, String mobile) {
    Assert.notNull(name, "이름은 필수 값입니다.");
    this.name = name;
    this.mobile = mobile;
  }

  /**
   * @deprecated 주문 상세 조회 에서도 도메인 모델을 전달하려 했으나 long타입 파라미터로 대체 하였습니다.
   */
  @Deprecated
  @Builder(builderClassName = "GetOrderDetailBuilder", builderMethodName = "getOrderDetailOrderBuilder")
  public Order(Long id, String name, String mobile) {
    Assert.notNull(name, "이름은 필수 값입니다.");
    this.id = id;
    this.name = name;
    this.mobile = mobile;
  }
}
