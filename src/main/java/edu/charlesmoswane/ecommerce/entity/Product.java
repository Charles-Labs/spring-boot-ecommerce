package edu.charlesmoswane.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name="product")
@Data
public class Product {
    private Long id;
    private String sku;
    private String description;
    private BigDecimal unitPrice;
    private String imageUrl;
}
