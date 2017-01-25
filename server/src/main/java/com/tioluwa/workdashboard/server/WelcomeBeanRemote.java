package com.tioluwa.workdashboard.server;

import javax.ejb.Local;

@Local
public interface WelcomeBeanRemote {
	
	public String sayHello();

}
