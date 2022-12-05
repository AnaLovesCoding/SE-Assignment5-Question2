package com.bsm.backend.apis.order1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order1Repository extends JpaRepository<Order1, Long> {
}
