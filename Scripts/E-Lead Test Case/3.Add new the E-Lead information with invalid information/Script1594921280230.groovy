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

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__eleadname'), findTestData('E-Lead Test Data/D4').getValue(
        1, 1))

WebUI.click(findTestObject('E-Lead repository/Page_E-Lead/Lead Source'))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input Lead Source'), 'Other')

WebUI.sendKeys(findTestObject('E-Lead repository/Page_E-Lead/input Lead Source'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('E-Lead repository/Page_E-Lead/serch accouts name'))

WebUI.switchToWindowTitle('Accounts')

WebUI.click(findTestObject('E-Lead repository/Page_Accounts/a_   sirinrut'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('E-Lead repository/Page_E-Lead/Rating'))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input Rating'), findTestData('E-Lead Test Data/D3').getValue(
        6, 1))

WebUI.sendKeys(findTestObject('E-Lead repository/Page_E-Lead/input Rating'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/textarea__Adress'), findTestData('E-Lead Test Data/D3').getValue(
        7, 1))

WebUI.click(findTestObject('E-Lead repository/Page_E-Lead/Search first Name'))

WebUI.switchToWindowTitle('Contacts')

WebUI.click(findTestObject('E-Lead repository/Page_Contacts/a_Suwanna'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/textarea__description'), findTestData('E-Lead Test Data/D3').getValue(
        10, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__sender com'), findTestData('E-Lead Test Data/D3').getValue(
        11, 1))

WebUI.setText(findTestObject('E-Lead repository/Page_E-Lead/input__reciever com'), findTestData('E-Lead Test Data/D3').getValue(
        12, 1))

WebUI.click(findTestObject('E-Lead repository/Page_E-Lead/button_Save E-Lead'))

WebUI.delay(2)

