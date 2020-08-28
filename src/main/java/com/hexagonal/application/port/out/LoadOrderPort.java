package com.hexagonal.application.port.out;

import com.hexagonal.domain.Order;

public interface LoadOrderPort {

  Order findOrder(long id);
}
