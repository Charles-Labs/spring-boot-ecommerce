package edu.charlesmoswane.ecommerce.dao;

import edu.charlesmoswane.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
