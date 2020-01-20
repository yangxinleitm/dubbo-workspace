package com.example.bootorderserviceprovider.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.demo.gmall.model.UserAddressModel;
import com.demo.gmall.service.UserService;



/**
 * @ClassName: UserServiceImpl
 * @Description:获取用户信息实现类，要实现UserService接口，要引用gmall-interface-api接口接口层
 * @author: YangXinLei
 * @date: 2020年1月19日 下午4:52:18
 */
@Service  //暴露服务
@Component
public class UserServiceImpl implements UserService {
	
	
	/**
	 *获取用户地址
	 */
	public List<UserAddressModel> getAllUserAddress(Integer uid) {
		List<UserAddressModel> userAddressList = new ArrayList<UserAddressModel>();
		UserAddressModel model1 = new UserAddressModel();
		UserAddressModel model2 =  new UserAddressModel();
		
		model1.setId(1);
		model1.setUserAddress("河南省驻马店市");
		model1.setUserId("123458762");
		model1.setPhoneNum("18837232560");
		model1.setConsignee("李四");
		model1.setIsDefault("Y");
		
		model2.setId(2);
		model2.setUserAddress("河南省郑州市");
		model2.setUserId("123458762");
		model2.setPhoneNum("18837232560");
		model2.setConsignee("张三测试");
		model2.setIsDefault("Y");
		
		userAddressList.add(model1);
		userAddressList.add(model2);
		
		List<UserAddressModel> dtoList = new ArrayList<UserAddressModel>();
		for(UserAddressModel model : userAddressList) {
			if(uid.equals(model.getId())) {
				UserAddressModel dto = new UserAddressModel();
				BeanUtils.copyProperties(model, dto);
				dtoList.add(dto);
			}
		}
		return dtoList;
	}

}
