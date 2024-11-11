package com.tiarlei.dscommerce.controllers;

import com.tiarlei.dscommerce.dto.ProductDTO;
import com.tiarlei.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        //ProductDTO dto = service.findById(id);
        //return dto;
        return service.findById(id);    //Esta linha oferece uma opcao mais simplificada do comando comentado acima.
    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public ProductDTO insert(@RequestBody ProductDTO dto) {
        //dto = service.insert(dto);
        //return dto;
        return service.insert(dto);
    }
}
