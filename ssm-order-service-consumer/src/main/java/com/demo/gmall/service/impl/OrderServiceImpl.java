package com.demo.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gmall.model.UserAddressModel;
import com.demo.gmall.service.OrderService;
import com.demo.gmall.service.UserService;

/**
 * @ClassName: OrderService
 * @Description: 
 * @author: YangXinLei
 *  @date: 2020-01-10
 * @param: 
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    UserService userService;

	/*
	 * 订单服务实现方法
	 */
	public List<UserAddressModel> initOrder(Integer uid) {
		List<UserAddressModel> allUserAddressList = userService.getAllUserAddress(uid);
		return allUserAddressList;
	}

}
