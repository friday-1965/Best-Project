import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/input__accountname'), findTestData('DBD Test Data/D5').getValue(1, 
        1))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/accountnameENG'), 'ถูมิพัจน์')

WebUI.click(findTestObject('Not in DBD/Page_Accounts/New Select/Customer SegmentN'))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/input Customer Segment'), findTestData('DBD Test Data/D5').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Not in DBD/Page_Accounts/input Customer Segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Not in DBD/Page_Accounts/New Select/Company levelN'))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/New Select/input Company level 1'), findTestData('DBD Test Data/D5').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Not in DBD/Page_Accounts/New Select/input Company level 1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Not in DBD/Page_Accounts/New Select/JPN'))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/input japanese'), findTestData('DBD Test Data/D5').getValue(4, 1))

WebUI.sendKeys(findTestObject('Not in DBD/Page_Accounts/input japanese'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Purchasing'), findTestData('DBD Test Data/D5').getValue(5, 1))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Branch ID'), findTestData('DBD Test Data/D5').getValue(6, 1))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Phone'), 'lol')

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Address'), findTestData('DBD Test Data/D5').getValue(7, 1))

WebUI.click(findTestObject('Not in DBD/Page_Accounts/searchZ'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('Not in DBD/Page_ZONE/a_270207'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Tax NO'), findTestData('DBD Test Data/D5').getValue(9, 1))

WebUI.click(findTestObject('Not in DBD/Page_Accounts/button_Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Phone'), '111-111-1111')

WebUI.click(findTestObject('Not in DBD/Page_Accounts/button_Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/accountnameENG'), findTestData('DBD Test Data/D4').getValue(2, 1))

WebUI.click(findTestObject('Not in DBD/Page_Accounts/New Select/Company statusN'))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/input company status'), findTestData('DBD Test Data/D4').getValue(
        8, 1))

WebUI.setText(findTestObject('Not in DBD/Page_Accounts/Phone'), findTestData('DBD Test Data/D4').getValue(12, 1))

WebUI.click(findTestObject('Not in DBD/Page_Accounts/button_Save'))

