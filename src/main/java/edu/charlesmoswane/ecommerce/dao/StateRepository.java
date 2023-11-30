package edu.charlesmoswane.ecommerce.dao;

import edu.charlesmoswane.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}