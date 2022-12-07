package com.bsm.backend.apis.product1;
import com.bsm.backend.apis.product.IProductService;
import com.bsm.backend.apis.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Product1Service implements IProduct1Service {
    private final Product1Repository repository;

    @Override
    public List<Product1> findAllProducts1() {
        return repository.findAll();
    }

    @Override
    public Product1 findProduct1ById(long product1Id) {
        return repository.findById(product1Id).orElseGet(null);
    }

    @Override
    public Product1 saveProduct1(Product1 product1) {
        return repository.save(product1);
    }

    @Override
    public Product1 deleteProduct1(Product1 product1) {
        repository.delete(product1);
        return product1;
    }
}
