package com.hexagonal.application.service;

import com.hexagonal.application.port.in.CreateOrderUseCase;
import com.hexagonal.application.port.in.command.OrderCommand;
import com.hexagonal.application.port.out.OrderCommandPort;
import com.hexagonal.domain.command.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateOrderService implements CreateOrderUseCase {

  private OrderCommandPort orderCommandPort;

  @Override
  public void save(OrderCommand command) {
    Order order = Order.createOrder().command(command).build();
    orderCommandPort.save(order);
  }
}
