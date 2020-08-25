package com.zeng.ssm2springboot.service;

import com.zeng.ssm2springboot.domain.Permission;
import com.zeng.ssm2springboot.domain.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll();

    void save(Role role) throws Exception;

    Role findById(String roleId);

    List<Permission> findOtherPermission(String roleId);

    void addPermissionToRole(String roleId, String[] permissions) throws Exception;
}
