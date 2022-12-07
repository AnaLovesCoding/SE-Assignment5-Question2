package com.bsm.backend.apis.orderdetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Oder_DetailService implements IOrder_DetailService {
    private Order_DetailRepository repository;
    @Override
    public List<Order_Detail> findAllOrder_Details1() {
        return repository.findAll();
    }

    @Override
    public Order_Detail findOrder_DetailById(long order_detail) {
        return repository.findById(order_detail).orElseGet(null);
    }

    @Override
    public Order_Detail saveOrder_Detail(Order_Detail order_detail) {
        return repository.save(order_detail);
    }

    @Override
    public Order_Detail deleteOrder_Detail(Order_Detail order_detail) {
        repository.delete(order_detail);
        return order_detail;
    }
}
