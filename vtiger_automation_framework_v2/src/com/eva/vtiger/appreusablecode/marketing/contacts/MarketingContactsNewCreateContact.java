package com.eva.vtiger.appreusablecode.marketing.contacts;

import com.eva.vtiger.utils.WebUtil;

public class MarketingContactsNewCreateContact {
	private String sirNameTB ="//select[@name='salutationtype']";
	private String firstNameTB ="//input[@name='firstname']";
	private String lastNameTB ="//input[@name='lastname']";
	private String phoneTB ="//input[@name='phone']";
	private String emailNameTB ="//input[@name='email']";
	private String mailingStreetTB ="//textarea[@name='mailingstreet']";
	private String maillingPoBoxTB ="//input[@name='mailingpobox']";
	private String maillingCityTB ="//input[@name='mailingcity']";
	private String mailingStateTB ="//input[@name='mailingstate']";
	private String maillingCountryTB ="//input[@name='mailingcountry']";
	private String CopyMailingAddressRB ="//b[text()='Copy Other Address']/following::input[@name='cpy']";
	private String descriptionTB ="//textarea[@name='description']";

	public String newCreateMarketingContacts(String expContactsName) {
		WebUtil.selectByValueAttribute(sirNameTB, "sir Name", "Mr.");	
		WebUtil.mySendKeys(firstNameTB, "first Name", expContactsName);
		WebUtil.mySendKeys(lastNameTB, "last Name", "EVA");
		WebUtil.mySendKeys(phoneTB, "office phone", "8764564654");
		WebUtil.mySendKeys(emailNameTB, "email Name", ""+expContactsName+".tester@qa.com");
		WebUtil.mySendKeys(mailingStreetTB, "mailing street name", "Sant Ravidash nagar near khamharia village");
		WebUtil.mySendKeys(maillingPoBoxTB, "mailing post office ", "bhadohi");
		WebUtil.mySendKeys(maillingCityTB, "mailing post city ", "varanashi");
		WebUtil.mySendKeys(mailingStateTB, "mailing state ", "utter pradesh");
		WebUtil.mySendKeys(maillingCountryTB, "mailing country", "india");
		WebUtil.click(CopyMailingAddressRB, "Copy mailing Address");
		WebUtil.click("//textarea[@name='description']", "Copy mailing Address");
		WebUtil.mySendKeys(descriptionTB, "description name ", "“Set your goals high, and don't stop till you get there.”");
		return expContactsName;
	}
}
