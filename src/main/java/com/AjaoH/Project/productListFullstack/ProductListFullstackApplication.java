/**
 * Author : Ajao Hazzan
 * Location : Finland
 * Project Title : Product Management System
 * Description : Fullstack solution, created with modern tools and technologies.
 * This project demonstrated how to create RESTul APIs for HTTP methods (GET , POST, UPDATE & DELETE),
 * The data will be converted to json format and will be connected to our MySQL database.
 *
 * NB: for you not to run into errors do these follows which I presumed you should have known
 * 1. Create a project database in your MySQL called productDB
 * 2. In the application properties set your root and password correctly.
 *
 * If you run into problem I will be ready to help !
 * (Suomi on paras)
 **********************************************************************************************************/


package com.AjaoH.Project.productListFullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductListFullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductListFullstackApplication.class, args);
		System.out.println("***Successfully Run SpringBoot Application****" );
	}

}
