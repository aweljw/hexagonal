package com.hexagonal.application.port.out;

import com.hexagonal.domain.Order;

public interface OrderMongoPort {

  Order findOrder(long id);
}
