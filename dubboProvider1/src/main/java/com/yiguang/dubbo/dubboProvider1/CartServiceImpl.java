package com.yiguang.dubbo.dubboProvider1;

import com.yiguang.dubbo.dubbo_demo.CartService;

public class CartServiceImpl implements CartService {

	public String findCartByUserId(Long userId) {
		return "第1个提供者 cart userId=" + userId;
	}
}

