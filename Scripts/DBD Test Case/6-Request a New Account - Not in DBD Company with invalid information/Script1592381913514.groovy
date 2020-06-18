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

WebUI.delay(1)

WebUI.click(findTestObject('DBD repository/Page_Accounts/Clear not DBD'))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input__accountENG'), findTestData('DBD Test Data/D5').getValue(
        1, 1))

WebUI.click(findTestObject('DBD repository/Page_Accounts/Customer Segment'))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input Customet segment'), findTestData('DBD Test Data/D5').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Accounts/input Customet segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_Accounts/company level'))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input conpany level'), findTestData('DBD Test Data/D5').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Accounts/input conpany level'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_Accounts/JP'))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input JP'), findTestData('DBD Test Data/D5').getValue(4, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Accounts/input JP'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input__Purchasing'), findTestData('DBD Test Data/D5').getValue(
        5, 1))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input__Branch ID'), findTestData('DBD Test Data/D5').getValue(
        6, 1))

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input address'), findTestData('DBD Test Data/D5').getValue(7, 
        1))

WebUI.click(findTestObject('DBD repository/Page_Accounts/searchZDBD'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('DBD repository/Page_ZONE/a_270207'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('DBD repository/Page_Accounts/input__Tax No'), findTestData('DBD Test Data/D5').getValue(9, 
        1))

WebUI.click(findTestObject('DBD repository/Page_Accounts/button_Save not DBD'))

