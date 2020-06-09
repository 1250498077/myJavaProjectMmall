package com.mmall.dao;

import com.mmall.pojo.Menu;
import com.mmall.pojo.MenuAuth;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<MenuAuth> selectMenuByUserId(Integer id);

    List<Menu> selectAllMenu();
}