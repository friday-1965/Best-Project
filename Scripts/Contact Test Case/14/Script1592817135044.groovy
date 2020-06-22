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

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Clear Opportunity'))

WebUI.delay(1)

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input__potentialname'), findTestData('Contact Test Data/D7').getValue(
        1, 1))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input__closingdate'), findTestData('Contact Test Data/D7').getValue(
        4, 1))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Clear Opportunity'))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Stage'))

WebUI.click(findTestObject('Page_Opportunities/span_--None--'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input stage'), findTestData('Contact Test Data/D7').getValue(
        5, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input stage'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/b MC trade'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input MC Trade'), findTestData('Contact Test Data/D7').getValue(
        6, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input MC Trade'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/b sale type'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input sale type'), findTestData('Contact Test Data/D7').getValue(
        7, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input sale type'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/input_Normal_cf_1392'))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/input_Lot Order_cf_1388'))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/b Lot Order Remove Reason'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input Lot Order Remove Reason'), findTestData('Contact Test Data/D7').getValue(
        8, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input Lot Order Remove Reason'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/button_Save Opportunity'))

