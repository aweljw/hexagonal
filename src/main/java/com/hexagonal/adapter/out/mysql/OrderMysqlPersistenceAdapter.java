package com.hexagonal.adapter.out.mysql;

import com.hexagonal.adapter.out.mysql.entity.OrderEntity;
import com.hexagonal.application.port.out.CreateOrderPort;
import com.hexagonal.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderMysqlPersistenceAdapter implements CreateOrderPort {

  private final OrderMysqlRepository orderMysqlRepository;

  @Override
  public long save(Order order) {
    OrderEntity orderEntity = OrderEntity.createOrderEntityBuilder()
        .name(order.getName())
        .mobile(order.getMobile())
        .build();

    OrderEntity result = orderMysqlRepository.save(orderEntity);

    return result.getOrd_no();
  }
}
