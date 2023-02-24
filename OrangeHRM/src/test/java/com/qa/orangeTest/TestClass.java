package com.qa.orangeTest;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orangebase.BaseClass;
import com.qa.orangepages.Dashboard;
import com.qa.orangepages.LoginPage;
import com.qa.utils.RandomNumGenerator;
import com.qa.utils.Screenshot;


public class TestClass extends BaseClass{
	
	
	LoginPage ObjLog;
	Screenshot ObjScreen;
	Dashboard ObjDashboard;
	
	public static Properties prop=null;
	
	
	@Test
	public void LoginVerification() throws IOException, InterruptedException
	{
		ObjLog=new LoginPage(driver);
		String username=com.qa.utils.ExcelUtility.getExcelData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);
		String password=com.qa.utils.ExcelUtility.getStringExcelData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);
		ObjLog.AddUsername(username);
		ObjLog.AddPassword(password);
	
		
		
	/*
		ObjLog.ClickSubmit();
		Thread.sleep(5000);
		ObjScreen= new Screenshot();
		Screenshot.screenshot(driver);
		
		RandomNumGenerator.randomNum();
		
		ObjDashboard= new Dashboard(driver);
		String Text=ObjDashboard.GetText();
		boolean isPresent=ObjDashboard.IsTextPresent();
		Thread.sleep(3000);
		Assert.assertEquals(Text, "Dashboard");
		Assert.assertTrue(isPresent);	
		
		*/
	}

}
