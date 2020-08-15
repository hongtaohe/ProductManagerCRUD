package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listAll(){
        return repository.findAll();
    }

    public void save(Product product){
        repository.save( product );
    }

    public Product get(Long id){
        return repository.findById( id ).orElse(null);
    }

    public void delete(Long id){
        repository.deleteById( id );
    }
}
