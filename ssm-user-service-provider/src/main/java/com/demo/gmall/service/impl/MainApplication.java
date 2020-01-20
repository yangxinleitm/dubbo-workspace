package com.demo.gmall.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApplication
 * @Description: MainApplication主测试类
 * @author: YangXinLei
 * @date: 2020-01-10
 * @param: 
 */
public class MainApplication {
	 public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
	        context.start();
	        System.out.print("服务提供者启动----");
	        System.in.read(); 
	        
	    }
}
