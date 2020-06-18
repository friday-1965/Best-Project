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

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/Clear DBD'))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__Regitration Number'), findTestData('DBD Test Data/D2').getValue(
        1, 1))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__company name'), findTestData('DBD Test Data/D2').getValue(
        2, 1))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input__Registion Date'), findTestData('DBD Test Data/D2').getValue(
        3, 1))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/Created By'))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/Created By'))

WebUI.setText(findTestObject('DBD repository/Page_DBDCompanies/input Created By'), findTestData('DBD Test Data/D2').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('DBD repository/Page_DBDCompanies/input Created By'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DBD repository/Page_DBDCompanies/button_Save Creating DBD'))

