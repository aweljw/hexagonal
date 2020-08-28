package com.hexagonal.application.port.in;

import com.hexagonal.adapter.out.response.OrderResponse;
import com.hexagonal.application.port.in.command.OrderCommand;

public interface OrderUseCase {

  OrderResponse save(OrderCommand command);

  OrderResponse find(long ordNo);
}
