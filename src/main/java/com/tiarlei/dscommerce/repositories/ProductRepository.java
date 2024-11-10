package com.tiarlei.dscommerce.repositories;

import com.tiarlei.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
