package com.yiguang.dubbo.dubboConsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiguang.dubbo.dubbo_demo.CartService;

public class CartController {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
//通过id查找对象		
		CartService cartService = (CartService) context.getBean("cartService");
		while (true) {
			String string = cartService.findCartByUserId(18L);
			System.out.println("服务消费者收到的结果:" + string);
			Thread.currentThread().sleep(1000);
		}

	}
}

