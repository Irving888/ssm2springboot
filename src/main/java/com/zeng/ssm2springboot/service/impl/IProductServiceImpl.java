package com.zeng.ssm2springboot.service.impl;

import com.zeng.ssm2springboot.dao.IProductDao;
import com.zeng.ssm2springboot.domain.Product;
import com.zeng.ssm2springboot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    public void save(Product product) {
        productDao.save(product);
    }
}
