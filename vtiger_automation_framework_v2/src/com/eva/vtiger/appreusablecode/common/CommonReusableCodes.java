package com.eva.vtiger.appreusablecode.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.eva.vtiger.utils.WebUtil;

public class CommonReusableCodes {

///   @override
		//private String userNameTB="//input[@name='user_name']";
		
	    @FindBy(xpath = "//input[@name='user_name']")
		private WebElement userNameTB;  ///  null
	    
		
	    @FindBy(xpath="//input[@name='user_password']")
		private WebElement passwordTB;
		
		@FindBy(xpath="//input[@title='Login [Alt+L]']")
		private WebElement loginBT;

		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement signOutBT;

		@FindBy(xpath="//img[contains(@title,'Create ')]")
		private WebElement creatNewPluseBT;
//		searchForElement-----
		@FindBy(xpath="//input[@name='search_text']")
		private WebElement searchforTB;
		
		@FindBy(xpath="//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
		private WebElement selectTypeDD;
		
		@FindBy(xpath="//input[@name='submit']")
		private WebElement searchButtonBT;
		
		@FindBy(xpath="//a[text()='Marketing']")
		private WebElement marketingLK;
		
		@FindBy(linkText = "Accounts")
		private WebElement accountsLK;
		
		

		public void login() {
			
			WebUtil.inputData(userNameTB,"admin");
			WebUtil.inputData(passwordTB, "admin");
			WebUtil.click(loginBT);
		}
		

		public void logOut() {
			WebUtil.click(signOutBT);
		}
		public void goToMarketingAccounts() {
		    WebUtil.mouseMoveToElement(marketingLK);
		    WebUtil.click(accountsLK);
		}

		public void saveButton(String uniqueXpathBetweenTwoSaveButton) {
			
		}
		public void searchForElement(String expName,String searchTypeAttributeValue) {
			WebUtil.inputData(searchforTB, expName);
			WebUtil.selectByValueAttribute(selectTypeDD, searchTypeAttributeValue);
			WebUtil.click(searchButtonBT);
		}

		public void searchForElement(int number,String searchTypeAttributeValue) {
			
			WebUtil.selectByValueAttribute(selectTypeDD, searchTypeAttributeValue);
			WebUtil.click(searchButtonBT);

		}

	
}
