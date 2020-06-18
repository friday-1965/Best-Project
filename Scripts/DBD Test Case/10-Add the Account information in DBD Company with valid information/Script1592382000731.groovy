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

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/Clear new DBD'))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__new accENG'), findTestData('DBD Test Data/D4').getValue(
        2, 1))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/new Customer segment'))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input new Customer segment'), findTestData('DBD Test Data/D4').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_DBDCompanies/input new Customer segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/new company level'))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input new company level'), findTestData('DBD Test Data/D4').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_DBDCompanies/input new company level'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/new JP'))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input newJP'), findTestData('DBD Test Data/D4').getValue(
        5, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_DBDCompanies/input newJP'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__new purchasing'), findTestData('DBD Test Data/D4').getValue(
        6, 1))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__new Branch'), findTestData('DBD Test Data/D4').getValue(
        7, 1))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__new phone'), findTestData('DBD Test Data/D4').getValue(
        9, 1))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input new address'), findTestData('DBD Test Data/D4').getValue(
        10, 1))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/new search DBD'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('DBD repository/Page_ZONE/a_270207'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/button_Save new create account'))

