package com.eva.vtiger.appreusablecode.inventry.invoice;

import com.eva.vtiger.utils.WebUtil;

public class InventryInvoiceCreatePage {

	private String expSubjectNameTB ="//input[@name='subject']";
	private String CustomerNumberTB ="//input[@name='customerno']";
	private String SelectContactBT ="//input[@name='contact_id']/following-sibling::img";
	private String PurchaseOrderTB ="//input[@name='vtiger_purchaseorder']";
	private String AccountNameTB ="//input[@name='account_name']/following-sibling::img";
	private String BillingAddressTB ="//textarea[@name='bill_street']";
	private String billPoBoxTB ="//input[@name='bill_pobox']";
	private String billCityTB ="//input[@name='bill_city']";
	private String billStateTB ="//input[@name='bill_state']";
	private String billCodeTB ="//input[@name='bill_code']";
	private String billCountryTB ="//input[@name='bill_country']";
	private String CopyBillingAddressRB ="//b[text()='Copy Shipping address']/parent::td/following-sibling::td//input";
	
	
	
	//TB--TextBox
	//BT--Button
	//RB--Radio Button
	public  String fillUpInvoiceInformation(String expSubjectName) {
		WebUtil.mySendKeys(expSubjectNameTB, "subject name",expSubjectName);
		WebUtil.mySendKeys(CustomerNumberTB, "Customer number", ""+expSubjectName+".er@gmail.com");
		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd=new InventoryInvoiceNewCreateInvoiceCommonAdd();
		WebUtil.click(SelectContactBT, "Select Contact");
		commonAdd.addElementName("man", "firstname");
		WebUtil.mySendKeys(PurchaseOrderTB,  "Purchase Order", "Contact list");
		WebUtil.click(AccountNameTB, "Account Name");
		WebUtil.myThread(2000);
		commonAdd.addElementName("Virendra Sir","accountname");
		WebUtil.mySendKeys(BillingAddressTB, "Billing Address", "Sant Ravidas nagar bhadohi");
		WebUtil.mySendKeys(billPoBoxTB, "bill_pobox", "bhadohi");
		WebUtil.mySendKeys(billCityTB, "ticker symbol", "kaushambi");
		WebUtil.mySendKeys(billStateTB, "state", "utter pradesh");
		WebUtil.mySendKeys(billCodeTB, "bill_code", "9856");
		WebUtil.mySendKeys(billCountryTB, "country", "indian");
		WebUtil.click(CopyBillingAddressRB, "Copy Billing address");
		return expSubjectName;
	}

}
