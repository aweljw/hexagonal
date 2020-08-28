package com.hexagonal.adapter.out.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Entity
@Table(name = "jw_order")
public class OrderEntity {

  private OrderEntity() {}

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ord_no")
  private Long ord_no;

  @Column(name = "name")
  private String name;

  @Column(name = "mobile")
  private String mobile;

  @Builder(builderClassName = "CreateOrderEntityBuilder", builderMethodName = "createOrderEntityBuilder")
  public OrderEntity(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }
}
