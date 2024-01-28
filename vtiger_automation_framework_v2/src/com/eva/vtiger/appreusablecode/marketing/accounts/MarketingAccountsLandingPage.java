package com.eva.vtiger.appreusablecode.marketing.accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.eva.vtiger.utils.WebUtil;

public class MarketingAccountsLandingPage {

	@FindBy(xpath = "//img[@title='Create Account...']")
	private WebElement createaccountBT;
	
	public void clickCreateAccountButton() {
	  WebUtil.click(createaccountBT);	
	}
	
	
	
	
	
	
}
