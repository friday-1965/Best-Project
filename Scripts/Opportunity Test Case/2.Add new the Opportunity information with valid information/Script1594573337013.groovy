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

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/clear opp'))

WebUI.delay(1)

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input__opp name'), findTestData('Opportunity Test Data/D3').getValue(
        1, 1))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/Search account name'))

WebUI.switchToWindowTitle('Accounts')

WebUI.click(findTestObject('Opportunity repository/Page_Accounts/a_   sirirut'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/Search contact name'))

WebUI.switchToWindowTitle('Contacts')

WebUI.click(findTestObject('Opportunity repository/Page_Contacts/a_ act contact name'))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input__closingdate opp'), 'character')

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/stage opp'))

WebUI.delay(2)

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input__closingdate opp'), findTestData('Opportunity Test Data/D3').getValue(
        4, 1))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/clear opp'))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/stage opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input stage opp'), findTestData('Opportunity Test Data/D3').getValue(
        5, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input stage opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/MC trade in opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input MC trade in opp'), findTestData('Opportunity Test Data/D3').getValue(
        6, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input MC trade in opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/sale type opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input sale type opp'), findTestData('Opportunity Test Data/D3').getValue(
        7, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input sale type opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input_Lot Order_cf_1388'))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input_Normal_cf_1392'))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/lot order remove opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input lot order remove opp'), findTestData(
        'Opportunity Test Data/D3').getValue(9, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input lot order remove opp'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/img_E_lineItemPopup cursorPointer alignMiddle'))

WebUI.switchToWindowTitle('Inventory')

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input_RICOH_entryCheckBox acer'))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/button_Select inventory'))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/status MC opp'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input status MC opp'), findTestData('Opportunity Test Data/D3').getValue(
        11, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input status MC opp'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/Configuration'))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input Configuration'), findTestData('Opportunity Test Data/D3').getValue(
        12, 1))

WebUI.sendKeys(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input Configuration'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input quantity'), findTestData('Opportunity Test Data/D3').getValue(
        13, 1))

WebUI.setText(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/input_price'), findTestData('Opportunity Test Data/D3').getValue(
        14, 1))

WebUI.click(findTestObject('Opportunity repository/Page_Opportunities NEW ADD/button_Save opp'))

