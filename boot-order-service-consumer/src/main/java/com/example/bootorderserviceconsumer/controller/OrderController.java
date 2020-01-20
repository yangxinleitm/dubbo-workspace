package com.example.bootorderserviceconsumer.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.gmall.model.UserAddressModel;
import com.demo.gmall.service.OrderService;

/**
 * @ClassName: OrderController
 * @Description: 订单服务请求
 * @author: YangXinLei
 * @date: 2020年1月20日 上午10:19:54
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/getOrderInfoByUid.do")
	@ResponseBody
	public List<UserAddressModel> initOrder(Integer uId) {
		List<UserAddressModel> initOrderList = orderService.initOrder(uId);
		return initOrderList;
	}
	
}
