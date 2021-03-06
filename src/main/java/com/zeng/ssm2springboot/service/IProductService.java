package com.zeng.ssm2springboot.service;

import com.zeng.ssm2springboot.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;

    void save(Product product);
}
