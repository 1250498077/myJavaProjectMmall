package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Menu;
import com.mmall.pojo.User;
import com.mmall.pojo.MenuAuth;

import java.util.List;

public interface IMenuService {

    // 增加菜单
    ServerResponse createMenu(Menu menu);

    // 修改菜单
    ServerResponse updateMenu(Menu menu);

    // 删除菜单
    ServerResponse<Menu> deleteMenu(int id);

    // 查询菜单
    ServerResponse<List<Menu>> queryAllMenu();

    // 根据用户查询菜单
    ServerResponse<List<MenuAuth>> queryMenuByUserId(User user);

    // 根据角色查询菜单
    ServerResponse<List<Menu>> queryAllByRoleId();

    // 修改菜单与角色的关系
    ServerResponse<Menu> bindRoleAndMenu();



}
