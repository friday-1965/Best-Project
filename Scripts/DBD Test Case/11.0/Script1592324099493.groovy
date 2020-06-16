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

WebUI.click(findTestObject('Page_Accounts/clear/div_Account ListDashboardRecently ModifiedLoading Widget'))

WebUI.delay(3)

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(1, 1))

WebUI.setText(findTestObject('null'), 'ไทยแลน')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_Accounts/input accrount status New'), 'Prospect')

WebUI.sendKeys(findTestObject('Page_Accounts/input accrount status New'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Customer Segment Input/Page_Accounts/input Customer Segment'), findTestData('DBD Test Data/D5').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Customer Segment Input/Page_Accounts/input Customer Segment'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(3, 1))

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(4, 1))

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(6, 1))

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(5, 1))

WebUI.setText(findTestObject('null'), 'adfssf')

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(7, 1))

WebUI.click(findTestObject('null'))

WebUI.switchToWindowTitle('ZONE')

WebUI.click(findTestObject('null'))

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D5').getValue(9, 1))

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.setText(findTestObject('null'), '111-111-1111')

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D4').getValue(2, 1))

WebUI.setText(findTestObject('null'), findTestData('DBD Test Data/D4').getValue(9, 1))

WebUI.click(findTestObject('null'))

