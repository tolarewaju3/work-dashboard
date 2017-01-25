package com.tioluwa.workdashboard.server;

import javax.ejb.Stateless;

@Stateless
public class WelcomeBean implements WelcomeBeanRemote {

	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hi There!";
	}

}
