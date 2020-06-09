package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.pojo.Role;

public interface IRoleService {

    // 创建角色
    ServerResponse createRole(Role role);

}
