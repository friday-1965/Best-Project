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

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/status result act opp'))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/assign to act opp'))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/status result act opp'))

WebUI.setText(findTestObject('Account repository/Page_Calendar activity related/input status result acti rel'), findTestData(
        'Opportunity Test Data/D7').getValue(12, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar activity related/input status result acti rel'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/assign to act opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input assign to act opp'), findTestData('Opportunity Test Data/D7').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Calendar/input assign to act opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/sale type act opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input sale type act opp'), findTestData('Opportunity Test Data/D7').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Calendar/input sale type act opp'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__date_start act opp'), findTestData('Opportunity Test Data/D7').getValue(
        7, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__time_start act opp'), findTestData('Opportunity Test Data/D7').getValue(
        8, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__due_date act opp'), findTestData('Opportunity Test Data/D7').getValue(
        9, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__time_end act opp'), findTestData('Opportunity Test Data/D7').getValue(
        10, 1))

WebUI.delay(1)

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/product group act opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input Produgroup rel opp'), 'No Product')

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Calendar/input Produgroup rel opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/show time as act opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input show time as rel opp'), findTestData('Opportunity Test Data/D7').getValue(
        13, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Calendar/input show time as rel opp'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/textarea__description rel opp'), findTestData('Opportunity Test Data/D7').getValue(
        14, 1))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/button_Save Activity opp'))

WebUI.delay(2)

