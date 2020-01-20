package com.example.bootorderserviceconsumer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.gmall.model.UserAddressModel;
import com.demo.gmall.service.OrderService;
import com.demo.gmall.service.UserService;

/**
 * @ClassName: OrderService
 * @Description: 订单服务实现类
 * @author: YangXinLei
 *  @date: 2020-01-10
 */
@Service
public class OrderServiceImpl implements OrderService {

	
	/**
	 * 资源UserService服务注册
	*/
//	@Autowired
    @Reference
	UserService userService;

	/*
	 * 订单服务实现方法
	 */
	public List<UserAddressModel> initOrder(Integer uid) {
		List<UserAddressModel> allUserAddressList = userService.getAllUserAddress(uid);
		return allUserAddressList;
	}

}
