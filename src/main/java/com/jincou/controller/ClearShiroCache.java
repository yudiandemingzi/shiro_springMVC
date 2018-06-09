package com.jincou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jincou.shiro.CustomRealm;

import org.apache.shiro.authz.annotation.RequiresPermissions;


/**
 * <p>Description: 手动调用controller清除shiro的缓存</p>
 * （非常有用，也非常必要：使用场景）
 * 当我作为管理原用户，修改了某一员工的资源权限，这个时候数据库中，该员工的权限是改变了，但是员工如果此时已经完成认证授权
 * ，那么这个时候他浏览其它页面，shiro只会在缓存中判断他有没有权限，而不会在到数据库，数据库的改变不会对它有效，那怎么解决呢？
 * 
 * 调用这个接口，会自动清理该用户的授权缓存，不会清认证缓存。所以当它浏览资源的时候，第一次他还得调realm中的授权方法，进行重新到
 * 数据库获取它的资源权限。
 */
@Controller
public class ClearShiroCache {
	
	//注入realm
	@Autowired
	private CustomRealm customRealm;
	
	@RequestMapping("/clearShiroCache")
	public String clearShiroCache(){
		
		//清除缓存，将来正常开发要在service调用customRealm.clearCached()
		customRealm.clearCached();
		
		return "success";
	}

}
