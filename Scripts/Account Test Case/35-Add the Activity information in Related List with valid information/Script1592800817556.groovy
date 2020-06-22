import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(1)

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/clear acti rel'))

WebUI.delay(1)

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input__subject acti rel'), findTestData(
        'Account Test Data/D11').getValue(1, 1))

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/acti type rel'))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input acti type rel'), findTestData('Account Test Data/D11').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar activity related/input acti type rel'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/sale type acti rel'))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input sale type acti rel'), findTestData(
        'Account Test Data/D11').getValue(4, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar activity related/input sale type acti rel'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input__date_start acti rel'), findTestData(
        'Account Test Data/D11').getValue(7, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input__time_start acti rel'), findTestData(
        'Account Test Data/D11').getValue(8, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input__due_date acti rel'), findTestData(
        'Account Test Data/D11').getValue(9, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input__time_end acti rel'), findTestData(
        'Account Test Data/D11').getValue(10, 1))

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/clear acti rel'))

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/status result acti rel'))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input status result acti rel'), findTestData(
        'Account Test Data/D11').getValue(12, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar activity related/input status result acti rel'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/search contact name acti rel'))

WebUI.switchToWindowTitle('Contacts')

WebUI.click(findTestObject('Account repository/Page_Contacts/a_OldSales2'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/show time as acti rel'))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input show time as acti rel'), findTestData(
        'Account Test Data/D11').getValue(13, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar activity related/input show time as acti rel'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/textarea__description acti rel'), findTestData(
        'Account Test Data/D11').getValue(14, 1))

WebUI.click(findTestObject('Account repository/Page_Calendar activity related/button_Save acti rel'))

