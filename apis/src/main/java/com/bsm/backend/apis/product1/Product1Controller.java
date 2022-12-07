package com.bsm.backend.apis.product1;
import com.bsm.backend.apis.product.IProductService;
import com.bsm.backend.apis.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product1")
@RequiredArgsConstructor
public class Product1Controller {
    private final IProduct1Service product1Service;

    @GetMapping("")
    public List<Product1> findAllProducts1() {
        return product1Service.findAllProducts1();
    }

    @GetMapping("/{product1Id}")
    public Product1 FindProduct1ById(@PathVariable long product1Id) {
        return product1Service.findProduct1ById(product1Id);
    }

    @PostMapping("")
    public Product1 saveProduct1(@RequestBody Product1 product1) {
        return product1Service.saveProduct1(product1);
    }

    @DeleteMapping("")
    public Product1 deleteProduct1(@RequestBody Product1 product1) {
        return product1Service.deleteProduct1(product1);
    }
}
