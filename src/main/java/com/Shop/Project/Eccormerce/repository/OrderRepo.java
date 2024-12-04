package com.Shop.Project.Eccormerce.repository;

import com.Shop.Project.Eccormerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
