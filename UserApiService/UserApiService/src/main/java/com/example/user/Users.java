package com.example.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

	private int userId;
	private String userName;
	
	private Posts posts; 
	private Notifications notifications;
	
	public Users(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
}
