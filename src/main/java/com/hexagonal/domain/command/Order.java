package com.hexagonal.domain.command;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.hexagonal.application.port.in.command.OrderCommand;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "jw_order")
public class Order {

  private Order() {}

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ord_no")
  private long ord_no;

  @Column(name = "name")
  private String name;

  @Column(name = "mobile")
  private String mobile;

  @Builder(builderMethodName = "createOrder")
  public Order(OrderCommand command) {
    this.name = command.getName();
    this.mobile = command.getMobile();
  }
}
