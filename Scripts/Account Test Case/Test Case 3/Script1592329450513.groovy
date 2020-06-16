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

WebUI.click(findTestObject('Page_Accounts/clear'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Accounts/input__accountname'), findTestData('Account Test Data/D3').getValue(1, 1))

WebUI.click(findTestObject('Page_Accounts/custome segment'))

WebUI.setText(findTestObject('Page_Accounts/input customer segment'), findTestData('Account Test Data/D3').getValue(2, 1))

WebUI.sendKeys(findTestObject('Page_Accounts/input customer segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Accounts/company level'))

WebUI.setText(findTestObject('Page_Accounts/input company level'), findTestData('Account Test Data/D3').getValue(3, 1))

WebUI.sendKeys(findTestObject('Page_Accounts/input company level'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Accounts/JP'))

WebUI.setText(findTestObject('Page_Accounts/input JP'), findTestData('Account Test Data/D3').getValue(4, 1))

WebUI.sendKeys(findTestObject('Page_Accounts/input JP'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Accounts/input__Branch'), findTestData('Account Test Data/D3').getValue(5, 1))

WebUI.setText(findTestObject('Page_Accounts/input__Purchasing'), findTestData('Account Test Data/D3').getValue(6, 1))

WebUI.setText(findTestObject('Page_Accounts/address'), findTestData('Account Test Data/D3').getValue(7, 1))

WebUI.click(findTestObject('Page_Accounts/searchZ'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('Page_ZONE/a_270207'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Page_Accounts/Tax no'), findTestData('Account Test Data/D3').getValue(8, 1))

WebUI.click(findTestObject('Page_Accounts/button_Save Account'))

WebUI.click(findTestObject('Page_Accounts/clear'))

WebUI.delay(1)

