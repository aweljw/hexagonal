package com.hexagonal.adapter.out.mysql;

import com.hexagonal.adapter.out.mysql.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMysqlRepository extends JpaRepository<OrderEntity, Long> {
}
