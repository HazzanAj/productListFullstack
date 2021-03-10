package com.AjaoH.Project.productListFullstack.ProductList;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class ProductA {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    private String productName;
    private String productPrice;
    private String productQuantity;
    private LocalDate  manufacturedDate;

    public ProductA(){

 }
    public ProductA(Long id,String productName,String productPrice,
                    String productQuantity,LocalDate manufacturedDate){
     this.id = id;
     this.productName = productName;
     this.productPrice = productPrice;
     this.productQuantity = productQuantity;
     this.manufacturedDate = manufacturedDate;

    }
    // Loaded Constructor without id
    public ProductA(String productName, String productPrice,
                    LocalDate manufacturedDate, String productQuantity)
    {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.manufacturedDate = manufacturedDate;
    }

    public Long getId() { return id; }

    public void setId(Long id) {this.id = id;}

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public String getProductPrice() { return productPrice; }

    public void setProductPrice(String productPrice) { this.productPrice = productPrice; }

    public String getProductQuantity() {return productQuantity;}

    public void setProductQuantity(String productQuantity) {this.productQuantity = productQuantity;}

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String  toString() {
     return "productA{" + "id=" + id +
             ", productName ='" + productName +'\'' +
             ", productPrice =" + productPrice +
             ", productQuantity ='" + productQuantity+'\'' +
             ", manufacturedDate ='" + manufacturedDate+'\'' +
             '}';

    }
}