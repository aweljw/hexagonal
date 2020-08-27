package com.hexagonal.application.port.in;

import com.hexagonal.application.port.in.command.OrderCommand;

public interface CreateOrderUseCase {
  void save(OrderCommand command);
}
