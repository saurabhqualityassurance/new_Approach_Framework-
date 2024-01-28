package com.eva.vtiger.runner;

import com.eva.vtiger.testscripts.InventoryInvoiceTestScripts;
import com.eva.vtiger.testscripts.MarketingAccountTestScripts;

public class Runner {

	public static void main(String[] args) {
//		InventoryInvoiceTestScripts iits=new InventoryInvoiceTestScripts();
//		iits.verifyVT0012AccountAndContactAddOnInvoiceForm();
		
		MarketingAccountTestScripts mas=new MarketingAccountTestScripts();
		mas.verifyVT001CreateAccount();
	}


}





