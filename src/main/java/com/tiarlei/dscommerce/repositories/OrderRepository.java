package com.tiarlei.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiarlei.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
