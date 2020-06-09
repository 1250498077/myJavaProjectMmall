package com.mmall.service.impl;

import com.google.common.collect.Lists;
import com.mmall.common.ServerResponse;
import com.mmall.dao.MenuMapper;
import com.mmall.dao.RoleMapper;
import com.mmall.dao.RoleMenuMapper;
import com.mmall.pojo.Menu;
import com.mmall.pojo.Product;
import com.mmall.pojo.Role;
import com.mmall.pojo.RoleMenu;
import com.mmall.service.IRoleService;
import com.mmall.util.DateTimeUtil;
import com.mmall.vo.ProductListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IRoleService")
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    /**
     * 创建角色
     * @param role
     * @return
     */
    @Override
    public ServerResponse<Role> createRole(Role role) {
        int roleId = roleMapper.insert(role);

        // 查询出所有的菜单
        List<Menu> menuList = menuMapper.selectAllMenu();
        List<RoleMenu> roleAndMenuList =  Lists.newArrayList();

        for(Menu menu : menuList){
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setRoleId(roleId);
            roleMenu.setMenuId(menu.getId());
            roleMenu.setStatus(0);
            roleAndMenuList.add(roleMenu);
        }

        roleMenuMapper.insertInitMenu(roleAndMenuList);
        return ServerResponse.createBySuccess(role);
    }


}
