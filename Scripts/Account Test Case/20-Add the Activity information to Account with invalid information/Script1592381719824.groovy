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

WebUI.click(findTestObject('Account repository/Page_Calendar/clear acti'))

WebUI.delay(3)

WebUI.click(findTestObject('Account repository/Page_Calendar/ass to acti'))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input ass to acti New'), findTestData('Account Test Data/D12').getValue(
        1, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar/input ass to acti New'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Calendar/sale type acti'))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input sale type acti'), findTestData('Account Test Data/D12').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar/input sale type acti'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Calendar/b acti'))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input select'), findTestData('Account Test Data/D12').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar/input select'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Calendar/search acti field  acti'))

WebUI.switchToWindowTitle('Opportunities')

WebUI.click(findTestObject('Account repository/Page_Opportunities/a_ - BW Printer'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Account repository/Page_Calendar/input__date_start acti'), findTestData('Account Test Data/D12').getValue(
        5, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input__time_start acti'), findTestData('Account Test Data/D12').getValue(
        6, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input__due_date acti'), findTestData('Account Test Data/D12').getValue(
        7, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input__time_end acti'), findTestData('Account Test Data/D12').getValue(
        8, 1))

WebUI.click(findTestObject('Account repository/Page_Calendar/search contact name acti'))

WebUI.switchToWindowTitle('Contacts')

WebUI.click(findTestObject('Account repository/Page_Contacts/a_'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Account repository/Page_Calendar/clear acti'))

WebUI.click(findTestObject('Account repository/Page_Calendar/status result acti'))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input status result acti'), findTestData('Account Test Data/D12').getValue(
        10, 1))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input status result acti'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Calendar/show time as acti'))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input show time as'), findTestData('Account Test Data/D12').getValue(
        11, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Calendar/input show time as'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Account repository/Page_Calendar/input__description acti'), findTestData('Account Test Data/D12').getValue(
        12, 1))

WebUI.click(findTestObject('Account repository/Page_Calendar/button_Save acti'))

WebUI.delay(2)

