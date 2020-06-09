package com.mmall.pojo;

import java.util.Date;

public class RoleMenu {
    private Integer id;

    private Integer roleId;

    private Integer menuId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public RoleMenu() {
        super();
    }

    public RoleMenu(Integer id, Integer roleId, Integer menuId, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public Integer getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}