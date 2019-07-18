package com.jincou.controller;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	/**
	 * 查询商品列表
	 * 执行queryItems需要"item:query"权限
	 */
	@RequestMapping("/queryItem")
	@RequiresPermissions("item:query")
	public ModelAndView queryItem() {
		// 创建modelAndView准备填充数据、设置视图
		ModelAndView modelAndView = new ModelAndView();
		// 填充数据
		modelAndView.addObject("itemsList", "查看商品页面");
		// 视图
		modelAndView.setViewName("item/itemsList");
		return modelAndView;
	}

}
