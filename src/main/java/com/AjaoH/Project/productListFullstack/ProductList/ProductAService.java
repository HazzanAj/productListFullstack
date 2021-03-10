package com.AjaoH.Project.productListFullstack.ProductList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductAService {
    private final ProductARepository productARepository;

    @Autowired
    public  ProductAService(ProductARepository productARepository){
        this.productARepository = productARepository;
    }
    public List<ProductA> showGetMapping(){
        System.out.println("*** Message From RESTFUL Api, GetMapping endpoint****");
        System.out.println("*** Successfully connected to Data Access Layer.Now, we can get data from our Database!****");
        return productARepository.findAll();
    }
    public  void addProductToDataBase( ProductA productA){
        Optional<ProductA> productAByName = productARepository
                .findProductAByProductName(productA.getProductName());
        /*Validation*/
        if ( productAByName.isPresent()){
            throw new IllegalStateException("product name already registered");
        }
        productARepository.save(productA);
    }
    public void deleteProductA(Long productAId){
        productARepository.findById(productAId);
        boolean exists = productARepository.existsById(productAId);
        if(!exists) {
            throw new IllegalStateException(
                    "productA with id" + productAId + "does not exist");
        }
        productARepository.deleteById(productAId);
        }
    @Transactional
    public void updateProductA(Long productAId,
                               String productName,
                               String productPrice,
                               String productQuantity) {
        ProductA productA = productARepository.findById(productAId)
                .orElseThrow(() -> new IllegalStateException(
                        "product with id" + productAId + "does not exist"));
        if ( productName != null && productName.length() > 0 &&
        !Objects.equals(productA.getProductName(), productName)){
            productA.setProductName(productName);
        }
        if ( productPrice != null && productPrice.length() > 0 &&
        !Objects.equals(productA.getProductPrice(), productPrice)){
            productA.setProductPrice(productPrice);
        }
        if ( productQuantity != null && productQuantity.length() > 0 &&
                !Objects.equals(productA.getProductQuantity(), productQuantity)){
            Optional<ProductA> productAOptional = productARepository
                    .findProductAByProductQuantity(productQuantity);
            if (productAOptional.isPresent()){
                throw new IllegalStateException("Products are Still Available");
            }
            productA.setProductQuantity(productQuantity);
        }

    }
}
