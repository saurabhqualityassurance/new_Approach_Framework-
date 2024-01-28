package com.eva.vtiger.testscripts;

import com.eva.vtiger.appreusablecode.common.CommonReusableCodes;
import com.eva.vtiger.appreusablecode.inventry.invoice.InventryInvoiceCreatePage;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsCreateAccountPage;
import com.eva.vtiger.appreusablecode.marketing.contacts.MarketingContactsNewCreateContact;
import com.eva.vtiger.utils.WebUtil;

public class InventoryInvoiceTestScripts {
	private String saveBT="//b[text()='Description Information']";

	public void verifyVT0012AccountAndContactAddOnInvoiceForm() {
		WebUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
		CommonReusableCodes cc=new CommonReusableCodes();
		cc.login();
		cc.goToSubLinkOfLink("Marketing", "Accounts");
		cc.creatNewPluseButton("Accounts");
		MarketingAccountsCreateAccountPage malp=new MarketingAccountsCreateAccountPage();
		malp.fillUpBasicInformation("Dhirendra1");
		cc.saveButton(saveBT);
		cc.goToSubLinkOfLink("Marketing", "Contacts");
		cc.creatNewPluseButton("Contacts");
		MarketingContactsNewCreateContact creatContact=new MarketingContactsNewCreateContact();
		creatContact.newCreateMarketingContacts("risab1");
		cc.saveButton(saveBT);
		cc.goToSubLinkOfLink("Inventory", "Invoice");
		cc.creatNewPluseButton("Invoice");
		InventryInvoiceCreatePage creatInvoice=new InventryInvoiceCreatePage();
		creatInvoice.fillUpInvoiceInformation("Test Account Name And Contact Name Addition");
	}
	
  
}
