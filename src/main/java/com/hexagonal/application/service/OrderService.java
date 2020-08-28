package com.hexagonal.application.service;

import com.hexagonal.adapter.out.response.OrderResponse;
import com.hexagonal.application.port.in.OrderUseCase;
import com.hexagonal.application.port.in.command.OrderCommand;
import com.hexagonal.application.port.out.CreateOrderPort;
import com.hexagonal.application.port.out.LoadOrderPort;
import com.hexagonal.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService implements OrderUseCase {

  private final CreateOrderPort createOrderPort;
  private final LoadOrderPort loadOrderPort;

  @Override
  public OrderResponse save(OrderCommand command) {
    Order order = Order.createOrderBuilder()
        .name(command.getName())
        .mobile(command.getMobile())
        .build();

    return OrderResponse.createOrderResponseBuilder()
        .ord_no(createOrderPort.save(order))
        .build();
  }

  @Override
  public OrderResponse find(long ordNo) {
    Order order = loadOrderPort.findOrder(ordNo);

    return OrderResponse.findOrderResponseBuilder()
        .ord_no(order.getId())
        .name(order.getName())
        .mobile(order.getMobile())
        .build();
  }
}
