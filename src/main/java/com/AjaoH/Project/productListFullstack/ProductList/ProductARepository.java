package com.AjaoH.Project.productListFullstack.ProductList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductARepository
        extends JpaRepository<ProductA, Long> {
    Optional<ProductA> findProductAByProductName(String productName);

    Optional<ProductA> findProductAByProductQuantity(String productQuantity);
}
