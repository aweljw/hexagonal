package com.hexagonal.application.port.out;

import com.hexagonal.domain.Order;

public interface CreateOrderPort {
  long save(Order order);
}
