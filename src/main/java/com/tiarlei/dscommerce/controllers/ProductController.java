package com.tiarlei.dscommerce.controllers;

import com.tiarlei.dscommerce.dto.ProductDTO;
import com.tiarlei.dscommerce.entities.Product;
import com.tiarlei.dscommerce.repositories.ProductRepository;
import com.tiarlei.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){
        //ProductDTO dto = service.findById(id);
        //return dto;

        return service.findById(id);    //Esta linha oferece uma opcao mais simplificada do comando acima.
    }
}
