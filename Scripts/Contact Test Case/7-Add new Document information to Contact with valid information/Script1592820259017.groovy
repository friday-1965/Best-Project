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

WebUI.setText(findTestObject('Contact repository/Page_Documents/input__notes_title'), findTestData('Contact Test Data/D3').getValue(
        1, 1))

WebUI.click(findTestObject('Contact repository/Page_Documents/b select'))

WebUI.setText(findTestObject('Contact repository/Page_Documents/input b select'), findTestData('Contact Test Data/D3').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Contact repository/Page_Documents/input b select'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Documents/Search Field Docdument'))

WebUI.switchToWindowTitle('Accounts')

WebUI.click(findTestObject('Contact repository/Page_Accounts/td_  sirinrut'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Contact repository/Page_Documents/button_Save Document'))

