package com.indus.train.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://34.70.58.70:7000");
        driver.manage()	.window().maximize();
        driver.findElement(By.id("About Us")).click();
        String txt =driver.getCurrentUrl();
        String php = "http://34.70.58.70:7000/content/about-us.php";
        if(txt.equalsIgnoreCase(php))
        {
        	System.out.print("Test is sucsessful" );
        	
        }
        else {
        	System.out.print("Test Failure");
        }
        driver.close();
	}
}
