package com.spring.client.login.dao;

import com.spring.client.login.vo.LoginVO;

public interface LoginDao {
	public LoginVO userIdselect(String userid);
	public LoginVO loginSelect(LoginVO lvo);
	public int loginHistoryInsert(LoginVO lvo);
	public int loginHistoryUpdate(LoginVO lvo);
	public LoginVO loginHisorySelect(String userId);                                    

}
