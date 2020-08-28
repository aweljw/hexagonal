package com.hexagonal.application.service;

import com.hexagonal.adapter.out.response.OrderResponse;
import com.hexagonal.application.port.in.OrderUseCase;
import com.hexagonal.application.port.in.command.OrderCommand;
import com.hexagonal.application.port.out.OrderCommandPort;
import com.hexagonal.application.port.out.OrderQueryPort;
import com.hexagonal.domain.command.CommandOrder;
import com.hexagonal.domain.query.QueryOrder;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService implements OrderUseCase {

  private OrderCommandPort orderCommandPort;
  private OrderQueryPort orderQueryPort;

  @Override
  public OrderResponse save(OrderCommand command) {
    CommandOrder order = CommandOrder.createOrder().command(command).build();
    CommandOrder result = orderCommandPort.save(order);

    return OrderResponse.createOrderResponseBuilder()
        .ord_no(result.getOrd_no())
        .build();
  }

  @Override
  public OrderResponse find(long ordNo) {
    QueryOrder order = orderQueryPort.findById(1L).get();
    return OrderResponse.findOrderResponseBuilder()
        .ord_no(order.getId())
        .name(order.getName())
        .mobile(order.getMobile())
        .build();
  }
}
