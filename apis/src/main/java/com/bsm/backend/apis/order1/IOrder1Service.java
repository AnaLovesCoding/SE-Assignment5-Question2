package com.bsm.backend.apis.order1;

import java.util.List;

public interface IOrder1Service {
    List<Order1> findAllOrders1();

    Order1 findOrder1ById(long orderId1);

    Order1 saveOrder1(Order1 order1);

    Order1 deleteOrder1(Order1 order1);
}
