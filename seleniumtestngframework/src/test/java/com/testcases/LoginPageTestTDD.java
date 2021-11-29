package com.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.ExcelReader;

public class LoginPageTestTDD {
	ExcelReader reader;
	
	@Test  (dataProvider = "getData")
	public void validateLogin(String uname,String pwd) {
		System.out.println(uname);
		System.out.println(pwd);
		
		
		
		
	}
	@DataProvider
	
	public Object[][]  getData() {
		
		String Excelpath="./Book1.xlsx";
		String SheetName="Sheet1";
		reader = new ExcelReader(Excelpath, SheetName);
		Object[][] data = reader.getTestData();
		return data; 
	}

}

