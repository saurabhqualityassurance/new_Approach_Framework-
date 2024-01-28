package com.eva.vtiger.appreusablecode.inventry.invoice;

import com.eva.vtiger.utils.WebUtil;

public class InventoryInvoiceNewCreateInvoiceCommonAdd {
	
	private String expSearchNameTB ="//input[@name='search_text']";
	private String searchTypeAttributeValueTB ="//input[@name='search_text']/parent::td/following-sibling::td//select";
	private String searchBT ="//input[@name='search_text']/parent::td/following-sibling::td[last()]//input";
	private String SearchNameValueClick="//*[@id='ListViewContents']//tr[2]//tr[2]//a";
	private String windowTitle="admin - Inventory - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
	
	public String searchForElement(String expSearchName,String searchTypeAttributeValue) {
		WebUtil.mySendKeys(expSearchNameTB, "search for", expSearchName);
		WebUtil.selectByValueAttribute(searchTypeAttributeValueTB, "select type", searchTypeAttributeValue);
		WebUtil.click(searchBT, "search button");
		return expSearchName;
	}	
	public void addElementName(String expSearchName,String valueAttribute) {
		WebUtil.switchToWindowByTitle("");
		WebUtil.windowMaximize();
		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd=new InventoryInvoiceNewCreateInvoiceCommonAdd();
		commonAdd.searchForElement(expSearchName,valueAttribute);
		WebUtil.myThread(2000);
		WebUtil.click(SearchNameValueClick, "SearchName click");
		WebUtil.myThread(2000);
		WebUtil.popUpAccept();
		WebUtil.switchToWindowByTitle(windowTitle);
		WebUtil.myThread(2000);
		 
	}
	
}
