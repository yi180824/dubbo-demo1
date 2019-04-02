package com.yiguang.dubbo.dubboProvider1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class provider1Main {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext-provider.xml");
		context.start();
		System.out.println("提供者1启动");
		while(true){}
	}

}



