package com.hexagonal.adapter.out.mongo;

import com.hexagonal.adapter.out.mongo.document.OrderDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderMongoRepository extends MongoRepository<OrderDocument, Long> {
}
