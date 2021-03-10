package com.AjaoH.Project.productListFullstack.ProductList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "api/v1/AjaoWork/recorded/productA")
public class ProductAController {

    private final ProductAService productAService;
    @Autowired
    public ProductAController(ProductAService productAService ){
        this.productAService = productAService;
    }
    @GetMapping
    public List<ProductA> showGetMapping(){
        return productAService.showGetMapping();

    }
    @PostMapping
    public  void addNewProductToDataBase(@RequestBody ProductA productA) throws IllegalAccessException{

        productAService.addProductToDataBase(productA);
    }
    @DeleteMapping(path ="{productAId}")
    public void deleteProductA(
            @PathVariable("productAId") Long productAId){
        productAService.deleteProductA(productAId);
    }
    @PutMapping(path = "{productAId}")
    public void updateProductA(
            @PathVariable("productAId") Long productAId,
            @RequestParam(required = false) String productName,
            @RequestParam(required = false) String productPrice,
            @RequestParam(required = false) String productQuantity){
        productAService.updateProductA(productAId, productName,productPrice,productQuantity);

    }
}

