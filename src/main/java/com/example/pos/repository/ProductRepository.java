package com.example.pos.repository;

import com.example.pos.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeshkumar on 08/04/17.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
