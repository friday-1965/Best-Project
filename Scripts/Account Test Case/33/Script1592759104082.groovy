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

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/clear opportunity'))

WebUI.delay(1)

WebUI.setText(findTestObject('Account repository/Page_Opportunities (1)/input__opportunuty name'), findTestData('Account Test Data/D19').getValue(
        1, 1))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/search contact name opportunity'))

WebUI.switchToWindowTitle('Contacts')

WebUI.click(findTestObject('Account repository/Page_Contacts/a_OldSales2'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Account repository/Page_Opportunities (1)/input__closingdate opportunity'), findTestData('Account Test Data/D19').getValue(
        4, 1))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/stage opportunity'))

WebUI.setText(findTestObject('Account repository/Page_Opportunities (1)/input stage opportunity'), findTestData('Account Test Data/D19').getValue(
        5, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Opportunities (1)/input stage opportunity'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/clear opportunity'))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/MC trade opportunity'))

WebUI.setText(findTestObject('Account repository/Page_Opportunities (1)/input MC trade Opportunity'), findTestData('Account Test Data/D19').getValue(
        6, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Opportunities (1)/input MC trade Opportunity'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Contact repository/Page_Opportunities/Sale type'))

WebUI.setText(findTestObject('Account repository/Page_Opportunities (1)/input sale type opportunity'), findTestData('Account Test Data/D19').getValue(
        7, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Opportunities (1)/input sale type opportunity'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/input_Normal opportunity'))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/input_Lot Order opportunity'))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/lot order remove opportunity'))

WebUI.setText(findTestObject('Account repository/Page_Opportunities (1)/input lot order remove opportunity'), findTestData(
        'Account Test Data/D19').getValue(9, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Opportunities (1)/input lot order remove opportunity'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Opportunities (1)/button_Save opportunity'))

