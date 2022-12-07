package com.bsm.backend.apis.order1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrder1Service {
    private Order1Repository repository;

    @Override
    public List<Order1> findAllOrders1() {
        return repository.findAll();
    }

    @Override
    public Order1 findOrder1ById(long orderId1) {
        return repository.findById(orderId1).orElseGet(null);
    }

    @Override
    public Order1 saveOrder1(Order1 order1) {
        return repository.save(order1);
    }

    @Override
    public Order1 deleteOrder1(Order1 order1) {
       repository.delete(order1);
       return order1;
    }
}
