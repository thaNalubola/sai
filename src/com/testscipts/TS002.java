package com.testscipts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TS002
{
@Test
public void ts002() 
{
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.addNewEmp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
	
	
	
}
}
