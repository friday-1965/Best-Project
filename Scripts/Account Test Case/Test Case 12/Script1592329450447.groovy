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

WebUI.click(findTestObject('Page_Accounts/button_More account'))

WebUI.click(findTestObject('Page_Accounts/a_Add Document account'))

WebUI.setText(findTestObject('Page_Documents/input__notes_title'), findTestData('Account Test Data/D7').getValue(1, 1))

WebUI.click(findTestObject('Page_Documents/Created By'))

WebUI.setText(findTestObject('Page_Documents/input Created By'), findTestData('Account Test Data/D7').getValue(2, 1))

WebUI.sendKeys(findTestObject('Page_Documents/input Created By'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Documents/calendar'))

WebUI.setText(findTestObject('Page_Documents/input calendat'), findTestData('Account Test Data/D7').getValue(3, 1))

WebUI.sendKeys(findTestObject('Page_Documents/input calendat'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Documents/search add doc'))

WebUI.switchToWindowTitle('Accounts')

WebUI.click(findTestObject('Page_Accounts/td_1400'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_Documents/button_Save doc'))

