package com.lipop.service;

import com.lipop.model.User;

public class UserService {
		public boolean userLogin(User user){
			if ("111".equals(user.getUserName())&"111".equals(user.getPassword())) {
				return true;
			}else{
				return false;
			}
		}
}
