package com.demo.gmall.service;

import java.util.List;

import com.demo.gmall.model.UserAddressModel;

/**
 * @ClassName: UserService
 * @Description: 用户信息服务接口
 * @author: YangXinLei
 * @date: 2020-01-10
 * @param: 
 */
public interface UserService {
	
	public List<UserAddressModel> getAllUserAddress(Integer uid);
	
}
