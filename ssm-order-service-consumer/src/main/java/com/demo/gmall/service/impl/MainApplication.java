package com.demo.gmall.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.gmall.service.OrderService;

/**
 * @ClassName: MainApplication
 * @Description: 
 * @author: YangXinLei
 * @date: 2020-01-10
 * @param: 
 */
public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.initOrder(1);
		System.out.print("服务消费者启动成功----");
		System.in.read();
	}
}
