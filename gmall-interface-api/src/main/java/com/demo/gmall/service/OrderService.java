package com.demo.gmall.service;

import java.util.List;

import com.demo.gmall.model.UserAddressModel;

/**
 * @ClassName: OrderService
 * @Description: 订单服务接口
 * @author: YangXinLei
 * @date: 2020-01-10
 * @param: 
 */
public interface OrderService {

	public List<UserAddressModel> initOrder(Integer uid);
}
