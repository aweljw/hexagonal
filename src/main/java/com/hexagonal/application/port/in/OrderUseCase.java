package com.hexagonal.application.port.in;

import com.hexagonal.application.model.response.OrderResponse;
import com.hexagonal.application.port.in.command.OrderCommand;

public interface OrderUseCase {

  OrderResponse save(OrderCommand command);

  OrderResponse find(long ordNo);
}
