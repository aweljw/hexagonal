package com.hexagonal.adapter.out.mysql;

import com.hexagonal.adapter.out.mysql.entity.OrderEntity;
import com.hexagonal.application.port.out.OrderJpaPort;
import com.hexagonal.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderJpaAdapter implements OrderJpaPort {

  private final OrderJpaRepository orderJpaRepository;

  @Override
  public long save(Order order) {
    OrderEntity orderEntity = OrderEntity.createOrderEntityBuilder()
        .name(order.getName())
        .mobile(order.getMobile())
        .build();

    OrderEntity result = orderJpaRepository.save(orderEntity);

    return result.getOrd_no();
  }
}
