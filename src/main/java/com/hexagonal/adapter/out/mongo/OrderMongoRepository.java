package com.hexagonal.adapter.out.mongo;

import com.hexagonal.domain.query.QueryOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderMongoRepository extends MongoRepository<QueryOrder, Long> {
}
