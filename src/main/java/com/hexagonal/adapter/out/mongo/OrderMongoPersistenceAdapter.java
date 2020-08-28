package com.hexagonal.adapter.out.mongo;

import com.hexagonal.adapter.out.mongo.document.OrderDocument;
import com.hexagonal.application.port.out.LoadOrderPort;
import com.hexagonal.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderMongoPersistenceAdapter implements LoadOrderPort {

  private final OrderMongoRepository orderMongoRepository;

  @Override
  public Order findOrder(long id) {
    OrderDocument orderDocument = orderMongoRepository.findById(id).get();
    return Order.getOrderDetailOrderBuilder()
        .id(orderDocument.getId())
        .name(orderDocument.getName())
        .mobile(orderDocument.getMobile())
        .build();
  }
}
