package com.codeup.dandihammocks.repositories;

import com.codeup.dandihammocks.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
