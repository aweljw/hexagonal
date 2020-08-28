package com.hexagonal.application.service;

import com.hexagonal.adapter.out.response.OrderResponse;
import com.hexagonal.application.port.in.OrderUseCase;
import com.hexagonal.application.port.in.command.OrderCommand;
import com.hexagonal.application.port.out.OrderJpaPort;
import com.hexagonal.application.port.out.OrderMongoPort;
import com.hexagonal.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService implements OrderUseCase {

  private final OrderJpaPort orderJpaPort;
  private final OrderMongoPort orderMongoPort;

  @Override
  public OrderResponse save(OrderCommand command) {
    Order order = Order.createOrderBuilder()
        .name(command.getName())
        .mobile(command.getMobile())
        .build();

    return OrderResponse.createOrderResponseBuilder()
        .ord_no(orderJpaPort.save(order))
        .build();
  }

  @Override
  public OrderResponse find(long ordNo) {
    Order order = orderMongoPort.findOrder(ordNo);

    return OrderResponse.findOrderResponseBuilder()
        .ord_no(order.getId())
        .name(order.getName())
        .mobile(order.getMobile())
        .build();
  }
}
