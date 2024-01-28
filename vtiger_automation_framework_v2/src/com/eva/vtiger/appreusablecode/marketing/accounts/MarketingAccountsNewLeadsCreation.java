package com.eva.vtiger.appreusablecode.marketing.accounts;

import com.eva.vtiger.utils.WebUtil;

public class MarketingAccountsNewLeadsCreation {

	private String sirNameTB ="//select[@name='salutationtype']";
	private String firstNameTB ="//input[@name='firstname']";
	private String lastNameTB ="//input[@name='lastname']";
	private String phoneTB ="//input[@name='phone']";
	private String emailNameTB ="//input[@name='email']";
	private String companyTB ="//input[@name='company']";
	private String laneTB ="//textarea[@name='lane']";
	private String CityTB ="//input[@name='mailingcity']";
	private String StateTB ="//input[@name='mailingstate']";
	private String countryTB ="//input[@id='country']";
	private String descriptionTB ="//textarea[@name='description']";

	
	public String newCreatMarketingLeads(String expLeadsName) {
		WebUtil.selectByValueAttribute(sirNameTB, "firstName", "Mr.");
		WebUtil.mySendKeys(firstNameTB, "firstName",expLeadsName);
		WebUtil.mySendKeys(lastNameTB, "lastName", "EVA");
		WebUtil.mySendKeys(phoneTB, "phone", "8081157129");
		WebUtil.mySendKeys(companyTB, "company", "Daphnish services pvt.ltd");
		WebUtil.mySendKeys(emailNameTB, "email", "eva.sigma2023@gmail.com");
		WebUtil.mySendKeys(laneTB, "street", "pashchim sharira");
		WebUtil.mySendKeys(countryTB, "country", "india");
		WebUtil.mySendKeys(CityTB, "city", "kaushambi");
		WebUtil.mySendKeys(StateTB, "state", "utter pradesh");
		WebUtil.mySendKeys(descriptionTB, "description", "Do work hard until you do");
		return expLeadsName;
	}


}
