package com.qa.orangebase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.qa.utils.RandomNumGenerator;

public class BaseClass {

	public WebDriver driver=null;
	
	RandomNumGenerator ObjRand;
	
	public static Properties prop=null;
	
	@BeforeTest
	public void LauchUrl() throws IOException, InterruptedException
	{
		prop= new Properties();
		FileInputStream PropertyFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop.load(PropertyFile);
		
		driver=new ChromeDriver();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//RandomNumGenerator.randomNum();
	}
}
