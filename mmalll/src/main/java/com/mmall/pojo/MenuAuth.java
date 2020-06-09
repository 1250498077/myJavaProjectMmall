package com.mmall.pojo;

import java.util.Date;

public class MenuAuth {
    private Integer id;

    private String name;

    private Integer parentId;

    private Integer level;

    private Integer status;

    private String url;

    private Integer state;

    private String remarks;

    private Date createTime;

    private Date updateTime;

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

    public Integer getStatus() {
        return status;
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

    public void setStatus(Integer status) {
        this.status = status;
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

    public MenuAuth(Integer id, String name, Integer parentId, Integer level, Integer status, String url, Integer state, String remarks, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
        this.status = status;
        this.url = url;
        this.state = state;
        this.remarks = remarks;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public MenuAuth() {
        super();
    }
}
