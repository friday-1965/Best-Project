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

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input stage'), findTestData('Contact Test Data/D7').getValue(
        5, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input stage'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/MC trade'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input MC Trade'), findTestData('Contact Test Data/D7').getValue(
        6, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input MC Trade'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Sale type'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input sale type'), findTestData('Contact Test Data/D7').getValue(
        7, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input sale type'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/input_Normal_cf_1392'))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/input_Lot Order_cf_1388'))

WebUI.delay(1)

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Lot Order Remove Reason'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input Lot Order Remove Reason'), findTestData('Contact Test Data/D7').getValue(
        8, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input Lot Order Remove Reason'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Opportunities/input_E_productName1'), findTestData('Contact Test Data/D7').getValue(9, 
        1))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/status MC'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input status MC'), findTestData('Contact Test Data/D7').getValue(
        10, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input status MC'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Configuration'))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input Configuration'), findTestData('Contact Test Data/D7').getValue(
        11, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Opportunities/input Configuration'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Contact repository/Page_Opportunities/input_E_listPrice1'), findTestData('Contact Test Data/D7').getValue(
        12, 1))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/button_Save Opportunity'))

