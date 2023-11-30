package edu.charlesmoswane.ecommerce.dao;

import edu.charlesmoswane.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}