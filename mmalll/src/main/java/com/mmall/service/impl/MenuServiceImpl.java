package com.mmall.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.mmall.common.ServerResponse;
import com.mmall.dao.MenuMapper;
import com.mmall.pojo.Category;
import com.mmall.pojo.Menu;
import com.mmall.pojo.User;
import com.mmall.service.IMenuService;
import com.mmall.pojo.MenuAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service("IMenuService")
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public ServerResponse createMenu(Menu menu) {
        menuMapper.insert(menu);
        return ServerResponse.createByErrorMessage("新增菜单成功");
    }

    @Override
    public ServerResponse updateMenu(Menu menu) {
        menuMapper.updateByPrimaryKey(menu);
        return ServerResponse.createByErrorMessage("更新菜单成功");
    }

    @Override
    public ServerResponse<Menu> deleteMenu(int id) {
        menuMapper.deleteByPrimaryKey(id);
        return ServerResponse.createByErrorMessage("删除菜单成功");
    }

    @Override
    public ServerResponse<List<Menu>> queryAllMenu() {
        List<Menu> menuList = menuMapper.selectAllMenu();
        return ServerResponse.createBySuccess(getTreeMenu(menuList));
    }

    public List<Menu> getTreeMenu(List<Menu> menuList) {
        List<Menu> parentsMenu = new ArrayList<>();
        for (Menu menu : menuList) {
            if (menu.getParentId() == 0) {
                // 单独获取菜单树级
                parentsMenu.add(menu);
            }
        }
        for (Menu menu : parentsMenu) {
            toTreeMenu(menu, menuList);
        }
        return parentsMenu;
    }

    public void toTreeMenu(Menu parentMenu, List<Menu> menus) {
        List<Menu> subMenus = new ArrayList<>();
        for (Menu menu : menus) {
            if (parentMenu.getId() == menu.getParentId()) {
                // 如果是叶子菜单 直接放到父级目录的子菜单列表里面
                subMenus.add(menu);
                toTreeMenu(menu, menus);
            }
        }
        parentMenu.setChildren(subMenus);
    }

    @Override
    public ServerResponse<List<MenuAuth>> queryMenuByUserId(User user) {

        JSONObject jsonObject = new JSONObject();

        List<MenuAuth> menuList = menuMapper.selectMenuByUserId(user.getId());

        return ServerResponse.createBySuccess(menuList);

    }


    @Override
    public ServerResponse<List<Menu>> queryAllByRoleId() {
        return null;
    }

    @Override
    public ServerResponse<Menu> bindRoleAndMenu() {
        return null;
    }
}
