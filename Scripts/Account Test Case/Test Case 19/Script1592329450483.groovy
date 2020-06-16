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

WebUI.click(findTestObject('Page_Calendar/clear acti'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Calendar/input__subject acti'), findTestData('Account Test Data/D11').getValue(1, 1))

WebUI.click(findTestObject('Page_Calendar/acti type'))

WebUI.setText(findTestObject('Page_Calendar/input acti type'), findTestData('Account Test Data/D11').getValue(2, 1))

WebUI.sendKeys(findTestObject('Page_Calendar/input acti type'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Calendar/product group acti'))

WebUI.setText(findTestObject('Page_Calendar/input product group acti'), 'No Product')

WebUI.sendKeys(findTestObject('Page_Calendar/input product group acti'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Calendar/button_Save acti'))

