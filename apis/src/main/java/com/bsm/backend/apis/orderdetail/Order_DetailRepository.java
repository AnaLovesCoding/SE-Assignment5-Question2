package com.bsm.backend.apis.orderdetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_DetailRepository extends JpaRepository<Order_Detail,Long> {
}
