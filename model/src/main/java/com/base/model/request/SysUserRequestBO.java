/**
 * 
 */
package com.base.model.request;

import com.hp.core.common.beans.BaseBean;

/**
 * @author huangping
 * 2016年8月23日 下午11:35:38
 */
public class SysUserRequestBO extends BaseBean {

	private static final long serialVersionUID = 1968676045080672505L;
	
	private Integer userId;

	private String userName;

	private String loginName;

	private String loginPwd;

	private String mobile;

	private String phoneNumber;

	private String address;

	private String email;

	private Byte status;
		
	private Byte identity;
	
	private String identitys;
	
	private Integer salaryStatic;
	
	private String cardNumber;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Byte getIdentity() {
		return identity;
	}

	public void setIdentity(Byte identity) {
		this.identity = identity;
	}

	public String getIdentitys() {
		return identitys;
	}

	public void setIdentitys(String identitys) {
		this.identitys = identitys;
	}

	public Integer getSalaryStatic() {
		return salaryStatic;
	}

	public void setSalaryStatic(Integer salaryStatic) {
		this.salaryStatic = salaryStatic;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


}
