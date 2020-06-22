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

WebUI.click(findTestObject('Account repository/Page_Competitor/clear competitor'))

WebUI.delay(1)

WebUI.setText(findTestObject('Account repository/Page_Competitor/input__competitor Name'), findTestData('Account Test Data/D21').getValue(
        1, 1))

WebUI.click(findTestObject('Account repository/Page_Competitor/company type competitot'))

WebUI.setText(findTestObject('Account repository/Page_Competitor/input company type competitot'), findTestData('Account Test Data/D21').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Competitor/input company type competitot'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Competitor/Product type competitor'))

WebUI.setText(findTestObject('Account repository/Page_Competitor/input Product type competitor'), findTestData('Account Test Data/D21').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Competitor/input Product type competitor'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Competitor/Commpetitor brand'))

WebUI.setText(findTestObject('Account repository/Page_Competitor/input Commpetitor brand'), findTestData('Account Test Data/D21').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('Account repository/Page_Competitor/input Commpetitor brand'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Account repository/Page_Competitor/button_Save competitor'))

