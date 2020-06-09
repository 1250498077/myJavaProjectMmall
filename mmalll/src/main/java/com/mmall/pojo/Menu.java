package com.mmall.pojo;

import java.util.Date;
import java.util.List;

public class Menu {
    private Integer id;

    private String name;

    private Integer parentId;

    private Integer level;

    private String url;

    private Integer state;

    private String remarks;

    private Date createTime;

    private Date updateTime;

    private List<Menu> children;

    public Menu() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public String getUrl() {
        return url;
    }

    public Integer getState() {
        return state;
    }

    public String getRemarks() {
        return remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Menu(Integer id, String name, Integer parentId, Integer level, String url, Integer state, String remarks, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
        this.url = url;
        this.state = state;
        this.remarks = remarks;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}