package com.demo.gmall.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.gmall.model.UserAddressModel;
import com.demo.gmall.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户地址信息接口实现类
 * @author: YangXinLei
 * @date: 2020-01-10
 * @param: 
 */
public class UserServiceImpl implements UserService {

	/**
	 * 根据uid完成对用户地址的查询功能
	 */
	public List<UserAddressModel> getAllUserAddress(Integer uid) {
		List<UserAddressModel> userAddressList = new ArrayList<UserAddressModel>();
		UserAddressModel model1 = new UserAddressModel();
		UserAddressModel model2 =  new UserAddressModel();
		
		model1.setId(1);
		model1.setUserAddress("河南省驻马店市");
		model1.setUserId("123458762");
		model1.setPhoneNum("18837232560");
		model1.setConsignee("");
		model1.setIsDefault("Y");
		
		model2.setId(1);
		model2.setUserAddress("河南省郑州市");
		model2.setUserId("123458762");
		model2.setPhoneNum("18837232560");
		model2.setConsignee("");
		model2.setIsDefault("Y");
		
		userAddressList.add(model1);
		userAddressList.add(model2);
		return userAddressList;
	}

}
