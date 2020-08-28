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
import org.springframework.util.Assert;

@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "jw_order")
public class CommandOrder {

  private CommandOrder() {}

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ord_no")
  private Long ord_no;

  @Column(name = "name")
  private String name;

  @Column(name = "mobile")
  private String mobile;

  @Builder(builderMethodName = "createOrder")
  public CommandOrder(OrderCommand command) {
    Assert.notNull(name, "이름은 필수 정보 입니다.");
    this.name = command.getName();
    this.mobile = command.getMobile();
  }
}
