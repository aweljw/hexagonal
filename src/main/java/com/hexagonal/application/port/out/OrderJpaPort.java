package com.hexagonal.application.port.out;

import com.hexagonal.domain.Order;

public interface OrderJpaPort {
  long save(Order order);
}
