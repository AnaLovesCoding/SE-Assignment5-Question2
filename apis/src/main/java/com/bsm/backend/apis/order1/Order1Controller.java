package com.bsm.backend.apis.order1;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order1")
@RequiredArgsConstructor
public class Order1Controller {
    private final IOrder1Service order1Service;

    @GetMapping("")
    public List<Order1> findAllOrders1() {
        return order1Service.findAllOrders1();
    }

    @GetMapping("/{order1Id}")
    public Order1 FindProductById(@PathVariable long order1Id) {
        return order1Service.findOrder1ById(order1Id);
    }

    @PostMapping("")
    public Order1 saveOrder1(@RequestBody Order1 order1) {
        return order1Service.saveOrder1(order1);
    }

    @DeleteMapping("")
    public Order1 deleteOrder1(@RequestBody Order1 order1) {
        return order1Service.deleteOrder1(order1);
    }
}
