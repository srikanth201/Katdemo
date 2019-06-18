import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Page_Execute Automation/input_Login_UserName'), 'aDMIN')

not_run: WebUI.click(findTestObject('Page_Execute Automation/form_UserName Password  '))

WebUI.setText(findTestObject('Page_Execute Automation/input_Login_Password'), 'mANAGER')

WebUI.click(findTestObject('Page_Execute Automation/input_Login_Login'))

WebUI.selectOptionByValue(findTestObject('Page_Execute Automation/select_SelectMr.Ms.'), '1', true)

WebUI.setText(findTestObject('Page_Execute Automation/input_Initial_Initial'), 'SAD')

WebUI.setText(findTestObject('Page_Execute Automation/input__FirstName'), 'ASDF')

WebUI.setText(findTestObject('Page_Execute Automation/input_Middle Name_MiddleName'), 'DSA')

WebUI.click(findTestObject('Page_Execute Automation/input_EnglishHindi_Save'))

WebUI.click(findTestObject('Page_Execute Automation/span_Logout'))

