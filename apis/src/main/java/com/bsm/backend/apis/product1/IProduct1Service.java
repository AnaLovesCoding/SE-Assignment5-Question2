package com.bsm.backend.apis.product1;

import java.util.List;

public interface IProduct1Service {
    List<Product1> findAllProducts1();

    Product1 findProduct1ById(long product1Id);

    Product1 saveProduct1(Product1 product1);

    Product1 deleteProduct1(Product1 product1);
}
