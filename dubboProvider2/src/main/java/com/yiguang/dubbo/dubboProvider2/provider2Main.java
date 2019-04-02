package com.yiguang.dubbo.dubboProvider2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class provider2Main {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext-provider.xml");
		context.start();
		System.out.println("提供者2启动");
		while(true){}
	}

}



