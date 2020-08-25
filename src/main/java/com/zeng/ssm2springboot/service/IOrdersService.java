package com.zeng.ssm2springboot.service;

import com.zeng.ssm2springboot.domain.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId);
}
