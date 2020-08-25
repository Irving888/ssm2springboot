package com.zeng.ssm2springboot.service;

import com.zeng.ssm2springboot.domain.Permission;

import java.util.List;

public interface IPermissionService {
    public List<Permission> findAll();

    void save(Permission permission) throws Exception;
}
