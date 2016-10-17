package com.galaxe.rst;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class LoginTest {
	public WebDriver driver;
	@Test(dataProvider = "testData")
	public void login(String id, String password){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rsthakur\\Downloads\\geckodriver-v0.11.1-win32\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://localhost:8080/rst/login");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[1]/input")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/div/table/tbody/tr[3]/td[1]/input")).click();
		AssertJUnit.assertEquals("http://localhost:8080/rst/loginEmployee", driver.getCurrentUrl());
		driver.close();
		
		
		
	}
  
	@DataProvider(name = "testData")
	public Object[][] readExcel() throws BiffException, IOException{
	File f= new File("C:\\Users\\rsthakur\\Desktop\\Test.xls");
	Workbook w= Workbook.getWorkbook(f);
	Sheet s=w.getSheet("Sheet1");
	int rows =s.getRows();
	int columns =s.getColumns();
	System.out.println(rows);
	System.out.println(columns);
	String inputData[][]= new String[rows][columns];
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			Cell c =s.getCell(j, i);
			inputData[i][j]=c.getContents();
			System.out.println(inputData[i][j]);
			
		}
	}
	return inputData;
	}
}
