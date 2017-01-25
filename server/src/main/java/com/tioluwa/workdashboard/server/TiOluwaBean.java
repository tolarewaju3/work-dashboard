package com.tioluwa.workdashboard.server;

import javax.ejb.Stateless;

@Stateless
public class TiOluwaBean implements TiOluwaBeanRemote {

	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello TiOluwa";
	}

}
