package com.demo.gmall.model;

import java.io.Serializable;

/**
 * @ClassName: UserAddressModel
 * @Description: 用户实现Model
 * @author: YangXinLei
 * @date: 2020-01-10
 * @param: 
 */
public class UserAddressModel implements Serializable{
	private static final long serialVersionUID = 5288445174023576573L;
	
	private Integer id;
	private String userAddress; //地址
	private String userId;  	//用户ID
	private String consignee; 	//收货人
	private String phoneNum;  	//电话号码
	private String isDefault; 	//是否为默认地址ַ
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
}
