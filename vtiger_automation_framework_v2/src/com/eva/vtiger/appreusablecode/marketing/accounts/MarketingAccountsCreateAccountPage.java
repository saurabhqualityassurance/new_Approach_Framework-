package com.eva.vtiger.appreusablecode.marketing.accounts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.eva.vtiger.appreusablecode.common.CommonReusableCodes;
import com.eva.vtiger.utils.WebUtil;
///  the extend CommonClass in each Page class
public class MarketingAccountsCreateAccountPage extends CommonReusableCodes {

	//fillUpBasicInformation-----
	    @FindBy(xpath = "//input[@name='accountname']")
		private WebElement AccountNameTB ;
	    
	    @FindBys(@FindBy(xpath="//a"))
	    private List<WebElement> linkCollection;
		
	    private String websiteTB ="//input[@name='website']";
		private String phoneTB ="//input[@id='phone']";
		private String tickerSymbolTB ="//input[@name='tickersymbol']";
		private String faxNameTB ="//input[@name='fax']";
		private String phonenumberTB ="//input[@name='email1']";
		private String billStreetTB ="//textarea[@name='bill_street']";
		private String billPoboxTB ="//input[@name='bill_pobox']";
		private String billCityTB ="//input[@name='bill_city']";
		private String billStateTB ="//input[@name='bill_state']";
		private String billCodeTB ="//input[@name='bill_code']";
		private String billCountryTB ="//input[@name='bill_country']";
		private String CopyBillingAddressRB ="//b[text()='Copy Shipping address']/parent::td/following-sibling::td//input";
		private String descriptionTB ="//textarea[@name='description']";
		
//		fillUpMoreInformation----
		private String otherphoneTB ="//input[@name='otherphone']";
		private String employeesTB ="//input[@name='employees']";
		private String otherEmailTB ="//input[@name='email2']";
		private String ownershipTB ="//input[@name='ownership']";
		private String industryTB ="//select[@name='industry']";

		public String fillUpBasicInformation(String expAccountName) {
			WebUtil.mySendKeys(AccountNameTB, "Account name",expAccountName);
			WebUtil.mySendKeys(websiteTB, "webSite name", ""+expAccountName+".er@gmail.com");
			WebUtil.mySendKeys(phoneTB, "phone number", "8947863734");
			WebUtil.mySendKeys(tickerSymbolTB, "ticker symbol", "plus");
			WebUtil.mySendKeys(faxNameTB, "fax", "A fax called telecopying");
			WebUtil.mySendKeys(phonenumberTB, "phone number", ""+expAccountName+".evs@gmail.com");
			WebUtil.mySendKeys(billStreetTB, "billing address", "prayagraj");
			WebUtil.mySendKeys(billPoboxTB, "billing post office box", " 527456283");
			WebUtil.mySendKeys(billCityTB, "city", "kaushambi");
			WebUtil.mySendKeys(billStateTB , "state", "utter pradesh");
			WebUtil.mySendKeys(billCodeTB , "billing code", "68536");
			WebUtil.mySendKeys(billCountryTB, "country", "india");
			WebUtil.click(CopyBillingAddressRB, "Copy Billing address");
			WebUtil.mySendKeys(descriptionTB, "description", "Do work hard util you do");
			return expAccountName;
		}
		
		public void fillUpMoreInformation(String chooseIndustryValueAttribute) {
			WebUtil.mySendKeys(otherphoneTB, "other phone","9876573434");
			WebUtil.mySendKeys(employeesTB, "employees", "5345");
			WebUtil.mySendKeys(otherEmailTB, "other email", "8947863734");
			WebUtil.mySendKeys(ownershipTB, "ownership", "72.27%");
			WebUtil.selectByValueAttribute(industryTB, "industry name",chooseIndustryValueAttribute );
		}
	
	
	
}
