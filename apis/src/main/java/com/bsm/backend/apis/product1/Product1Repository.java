package com.bsm.backend.apis.product1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product1Repository extends JpaRepository<Product1, Long> {
}
