package com.hexagonal.adapter.out.mysql;

import com.hexagonal.domain.command.CommandOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<CommandOrder, Long> {
}
