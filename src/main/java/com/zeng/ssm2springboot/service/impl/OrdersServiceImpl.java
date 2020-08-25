package com.zeng.ssm2springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.zeng.ssm2springboot.dao.IOrdersDao;
import com.zeng.ssm2springboot.domain.Orders;
import com.zeng.ssm2springboot.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;

    public List<Orders> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    public Orders findById(String ordersId) {
        return ordersDao.findById(ordersId);
    }
}
