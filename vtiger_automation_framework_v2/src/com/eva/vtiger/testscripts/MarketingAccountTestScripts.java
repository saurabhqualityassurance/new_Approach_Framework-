 package com.eva.vtiger.testscripts;

import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.appreusablecode.common.CommonReusableCodes;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsCreateAccountPage;
import com.eva.vtiger.appreusablecode.marketing.accounts.MarketingAccountsLandingPage;
import com.eva.vtiger.utils.WebUtil;

public class MarketingAccountTestScripts {
 
	/////  intialize 
	
	public void verifyVT001CreateAccount() {
		WebUtil.printMessage("====  verifyVT001CreateAccount starts from here====");
		WebUtil.openLoginPage();
		CommonReusableCodes cc=PageFactory.initElements(WebUtil.driver, CommonReusableCodes.class);
		cc.login();
		cc.goToMarketingAccounts();
		
		MarketingAccountsLandingPage malp=PageFactory.initElements(WebUtil.driver, MarketingAccountsLandingPage.class);
	//	MarketingAccountsLandingPage malp=new MarketingAccountsLandingPage();
		malp.clickCreateAccountButton();
		
		MarketingAccountsCreateAccountPage macp=PageFactory.initElements(WebUtil.driver, MarketingAccountsCreateAccountPage.class);
		macp.fillUpBasicInformation("dajhvfajhvj");
		
		//		String expAccountName =malp.fillUpBasicInformation("Suraj Singh");		
//		
////		cc.searchForElement(expAccountName,  "accountname");
////		Thread.sleep(3000);
////		
////		if (actAccountName.equalsIgnoreCase(expAccountName)) {
////			WebUtil.printMessage("Passed !,new Account is created successfully");
////
////		} else {
////			WebUtil.printMessage("Failed !,new Account is not created successfully");
////		}
////		cc.logOut();
////		WebUtil.myQuit();
////		WebUtil.printMessage("====  verifyVT001CreateAccount ends from here====");
	}

//	public void verifyVT002DeleteAccount(String name) throws InterruptedException {
//		WebUtil.printMessage("====  verifyVT002DeleteAccount starts from here====");
//
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		cc.creatNewPluseButton("Accounts");
//		MarketingAccountsCreateAccountPage malp=new MarketingAccountsCreateAccountPage();
//		malp.fillUpBasicInformation(name);
//		cc.saveButton(saveBT);
//		Thread.sleep(5000);
//		WebUtil.mouseClick(deleteBT, "delete button");
//		WebUtil.popUpAccept();
//		cc.searchForElement(name, "accountname");
//		String expResult="No Account Found !";
//		String actResult=WebUtil.myInnerText("//span[@class='genHeaderSmall']", "Account Result");
//
//		if(expResult.equalsIgnoreCase(actResult)) {
//			System.out.println("Passed!,your created lead has been deleted successfully");
//		}else {
//			System.out.println("failed!,your created lead hasn't been deleted successfully");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("====  verifyVT002DeleteAccount ends from here====");
//	}
//
//	public void verifyVT003SearchAccount() throws InterruptedException {
//		WebUtil.printMessage("====  verifyVT003SearchAccount Starts from here====");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		cc.creatNewPluseButton("Accounts");
//		MarketingAccountsCreateAccountPage malp=new MarketingAccountsCreateAccountPage();
//		malp.fillUpBasicInformation("Suraj Yadav");
//		String expName="Shyam bhan";
//		cc.searchForElement( expName, "accountname");
//		Thread.sleep(4000);
//		String actName=WebUtil.myInnerText(accountNameTB, "Account Name");
//		if (expName.equalsIgnoreCase(actName)) {
//			WebUtil.printMessage("Passed!,your expected name is searched successfully");
//		} else {
//			WebUtil.printMessage("failed!,your expected name is not searched successfully");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("====  verifyVT003SearchAccount ends from here====");
//	}
//	public void verifyVT004DuplicateAccount(String firstAccountName,String secondAccountName) {
//		WebUtil.printMessage("======= verifyVT004DuplicateAccount Starts from here ======");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.goToSubLinkOfLink("Marketing","Accounts");
//		cc.creatNewPluseButton("Accounts");
//		MarketingAccountsCreateAccountPage  malp=new MarketingAccountsCreateAccountPage();
//		malp.fillUpBasicInformation(firstAccountName);
//		cc.saveButton(saveBT);
//		String firstWebsiteName=WebUtil.myInnerText(websiteTB,"website Name");
//		WebUtil.click(duplicateBT, "Duplicate");
//		WebUtil.myClear(acNameTB, "Account Name");
//		WebUtil.mySendKeys(acNameTB, "Account Name", secondAccountName);
//		String secondWebsiteName=WebUtil.getAttributeValue(websiteValueTB, "website name", "value");
//		if (firstWebsiteName.equalsIgnoreCase(secondWebsiteName)) {
//			WebUtil.printMessage("Passed !,the privious data and current data is matched successfully");
//		} else {
//			WebUtil.printMessage("Failed !,the privious data and current data is not matched successfully");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("======= verifyVT004DuplicateAccount ends from here ======");
//	}
//
//	public void verifyVT005AccountEditable(String editACName)  {
//		WebUtil.printMessage("===== verifyVT005AccountEditable starts from here ======");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		WebUtil.click(acIdName, "Account Name");
//		String acNameBeforeEdit=WebUtil.myInnerText(acNameBeforeEditLnk, "AccountName");
//		WebUtil.click(editLnk, "edit button");
//		WebUtil.myClear(acNameTB, "AccountName");
//		WebUtil.mySendKeys(acNameTB, "A/C_Name",editACName);
//		cc.saveButton(saveBT);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		String acNameAfterEdit=WebUtil.myInnerText(acNameAfterEditTB, "acNameAfterEdit");
//		if (!acNameBeforeEdit.equalsIgnoreCase(acNameAfterEdit)) {  ///  !...not equalsIgnoreCase
//			System.out.println("Passed !,your Account name is editable because your before edit A/C name ="+acNameBeforeEdit+" "
//					+ "and after edit A/C name ="+acNameAfterEdit+" is different");
//
//		} else {
//			System.out.println("Failed !,your Account name is editable because your before edit A/C name ="+acNameBeforeEdit+" "
//					+ "and after edit A/C name ="+acNameAfterEdit+" is same");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("===== verifyVT005AccountEditable ends from here ======");
//	}
//
//	public void verifyVT006AccountTableLinks(String acName) {
//		WebUtil.printMessage("===== verifyVT006AccountTableLinks starts from here ======");
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		cc.creatNewPluseButton("Accounts");
//		MarketingAccountsCreateAccountPage malp=new MarketingAccountsCreateAccountPage();
//		malp.fillUpBasicInformation(acName);
//		cc.saveButton(saveBT);
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		String accountNameBeforeClick=WebUtil.myInnerText("//table[@class='lvt small']//tr//td//a[text()='"+acName+"']", "AccountName");
//		WebUtil.click("//table[@class='lvt small']//tr//td//a[text()='"+acName+"']", "Account name");
//		String accountNameAfterClickLink=WebUtil.myInnerText("//span[@id='dtlview_Account Name']", "accountNameAfterClickLink");
//		if(accountNameBeforeClick.equalsIgnoreCase(accountNameAfterClickLink)) {
//			WebUtil.printMessage("Passed !,Account name is same After clicking the account name link");
//		}else {
//			WebUtil.printMessage("Failed !,Account name is not same After clicking the account name link");
//		}
//		cc.logOut();
//		WebUtil.myQuit();
//		WebUtil.printMessage("===== verifyVT006AccountTableLinks ends from here ======");
//	}
//	public void VerifyVT007MarketingTableRowAfterCreatingAccount(String acName) {
//		CommonReusableCodes cc=new CommonReusableCodes();
//		cc.login();
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		int countBeforeAccountCreation=WebUtil.getTableRowCount("//table[@class='lvt small']", "Accounts");
//		cc.creatNewPluseButton("Accounts");
//		MarketingAccountsCreateAccountPage malp=new MarketingAccountsCreateAccountPage();
//		malp.fillUpBasicInformation(acName);
//		cc.saveButton(saveBT);
//		cc.goToSubLinkOfLink("Marketing", "Accounts");
//		int countAfterAccountCreation=WebUtil.getTableRowCount(tableXpath, "Accounts");
//		if (countAfterAccountCreation==countBeforeAccountCreation+1) {
//			WebUtil.printMessage("new created Account is added in table row successfully ");
//		} else {
//			WebUtil.printMessage("new created Account is not added in table row successfully ");
//		}
//
//	}
}