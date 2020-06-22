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

WebUI.click(findTestObject('DBD repository/Page_Calendar/Clear acti'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input__subject acti'), findTestData('DBD Test Data/D8').getValue(
        1, 1))

WebUI.click(findTestObject('DBD repository/Page_Calendar/activity type'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input activity type'), findTestData('DBD Test Data/D8').getValue(
        2, 1))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input activity type'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_Calendar/assign to'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input assign to'), findTestData('DBD Test Data/D8').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Calendar/input assign to'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_Calendar/sale type acti'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input sale type acti'), findTestData('DBD Test Data/D8').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Calendar/input sale type acti'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input__date_start'), findTestData('DBD Test Data/D8').getValue(
        7, 1))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input__time_start'), findTestData('DBD Test Data/D8').getValue(
        13, 1))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input__due_date'), findTestData('DBD Test Data/D8').getValue(
        8, 1))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input__time_end'), findTestData('DBD Test Data/D8').getValue(
        14, 1))

WebUI.click(findTestObject('DBD repository/Page_Calendar/Clear acti'))

WebUI.delay(1)

WebUI.click(findTestObject('DBD repository/Page_Calendar/status result'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input status result'), findTestData('DBD Test Data/D8').getValue(
        10, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Calendar/input status result'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_Calendar/Product Group'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input Product Group'), 'Fax')

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input Product Group'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_Calendar/Show time as'))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input Show time as'), findTestData('DBD Test Data/D8').getValue(
        11, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_Calendar/input Show time as'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD repository/Page_Calendar/input__description'), findTestData('DBD Test Data/D8').getValue(
        12, 1))

WebUI.click(findTestObject('DBD repository/Page_Calendar/button_Save acti'))

