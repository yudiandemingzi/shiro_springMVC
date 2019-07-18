package com.jincou.model;

import java.io.Serializable;
import java.util.List;

/**
 * 用户身份信息，获取通过用户名得到密码和菜单和页面权限
 */
public class ActiveUser implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private String userid;
    /**
     * 用户账号
     */
    private String usercode;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 菜单
     */
    private List<SysPermission> menus;
    /**
     * 权限
     */
    private List<SysPermission> permissions;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public List<SysPermission> getMenus() {
        return menus;
    }

    public void setMenus(List<SysPermission> menus) {
        this.menus = menus;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }


}
