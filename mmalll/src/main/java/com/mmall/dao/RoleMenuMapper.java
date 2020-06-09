package com.mmall.dao;

import com.mmall.pojo.Product;
import com.mmall.pojo.RoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMenuMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);

    int updateMenuAndRole(@Param("menus")List<RoleMenu> menus);

    int insertInitMenu(@Param("menus")List<RoleMenu> menus);
}