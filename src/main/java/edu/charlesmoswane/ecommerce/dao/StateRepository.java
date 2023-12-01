package edu.charlesmoswane.ecommerce.dao;

import edu.charlesmoswane.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Set;

@CrossOrigin("http://localhost:4200")
public interface StateRepository extends JpaRepository<State, Integer> {
    Set<State> findByCountryCode(@Param("code") String code);
}