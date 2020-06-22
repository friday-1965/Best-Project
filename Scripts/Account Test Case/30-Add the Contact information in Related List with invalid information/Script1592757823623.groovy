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

WebUI.click(findTestObject('Account repository/Page_Contacts related/clear contact'))

WebUI.delay(1)

WebUI.click(findTestObject('Account repository/Page_Contacts related/Title contact'))

WebUI.setText(findTestObject('Account repository/Page_Contacts related/input title contact'), findTestData('Account Test Data/D17').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Contacts related/input title contact'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Account repository/Page_Contacts related/input__job position contact'), findTestData('Account Test Data/D17').getValue(
        4, 1))

WebUI.setText(findTestObject('Account repository/Page_Contacts related/input__firstname contact'), findTestData('Account Test Data/D17').getValue(
        5, 1))

WebUI.setText(findTestObject('Account repository/Page_Contacts related/input__homephone contact'), findTestData('Account Test Data/D17').getValue(
        12, 1))

WebUI.setText(findTestObject('Account repository/Page_Contacts related/input__email contact'), findTestData('Account Test Data/D17').getValue(
        13, 1))

WebUI.click(findTestObject('Account repository/Page_Contacts related/button_Save contact'))

