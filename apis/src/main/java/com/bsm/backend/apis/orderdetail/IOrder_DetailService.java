package com.bsm.backend.apis.orderdetail;

import com.bsm.backend.apis.order1.Order1;

import java.util.List;

public interface IOrder_DetailService {
    List<Order_Detail> findAllOrder_Details1();

    Order_Detail findOrder_DetailById(long order_detail);

    Order_Detail saveOrder_Detail(Order_Detail order_detail);

    Order_Detail deleteOrder_Detail(Order_Detail order_detail);
}
