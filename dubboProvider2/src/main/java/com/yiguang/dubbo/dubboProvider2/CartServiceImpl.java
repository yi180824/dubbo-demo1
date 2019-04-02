package com.yiguang.dubbo.dubboProvider2;

import com.yiguang.dubbo.dubbo_demo.CartService;

public class CartServiceImpl implements CartService {

	public String findCartByUserId(Long userId) {
		return "第2个提供者 cart userId=" + userId;
	}
}
