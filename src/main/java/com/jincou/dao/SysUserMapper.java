package com.jincou.dao;

import java.util.List;


import com.jincou.model.SysUser;
import com.jincou.model.SysUserExample;

public interface SysUserMapper {
   

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

}