package com.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.orangebase.BaseClass;

public class Screenshot extends BaseClass{
	//method for taking the screenshot
	public static void screenshot(WebDriver driver)
	{
		//Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

	}

}
