package com.tiarlei.dscommerce.services;

import com.tiarlei.dscommerce.dto.ProductDTO;
import com.tiarlei.dscommerce.entities.Product;
import com.tiarlei.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        //Optional<Product> result = repository.findById(id);
        //Product product = result.get();
        //ProductDTO dto = new ProductDTO(product);
        //return dto;

        Product product = repository.findById(id).get();    //Esta opcao mais simplificada faz a mesma tarefa das linhas acima comentadas.
        return new ProductDTO(product);
    }
}