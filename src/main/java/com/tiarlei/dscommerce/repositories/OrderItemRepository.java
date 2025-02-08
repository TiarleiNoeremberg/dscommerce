package com.tiarlei.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiarlei.dscommerce.entities.Order;
import com.tiarlei.dscommerce.entities.OrderItem;
import com.tiarlei.dscommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
