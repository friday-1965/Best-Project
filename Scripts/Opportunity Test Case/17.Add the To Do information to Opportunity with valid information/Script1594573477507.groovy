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

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__subject to do opp'), findTestData('Opportunity Test Data/D9').getValue(
        1, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__date_start to do opp'), findTestData('Opportunity Test Data/D9').getValue(
        3, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/input__due_date to do opp'), findTestData('Opportunity Test Data/D9').getValue(
        5, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Calendar/textarea__description to do opp'), findTestData('Opportunity Test Data/D9').getValue(
        6, 1))

WebUI.click(findTestObject('Opportunity repository/Page_Calendar/button_Save Activity opp'))

WebUI.delay(2)

